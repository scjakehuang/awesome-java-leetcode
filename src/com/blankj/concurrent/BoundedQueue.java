package com.blankj.concurrent;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/22
 */
public class BoundedQueue {

    private LinkedList<Object> buffer;    //生产者容器
    private int maxSize ;           //容器最大值是多少
    private Lock lock;
    private Condition fullCondition;
    private Condition notFullCondition;
    BoundedQueue(int maxSize){
        this.maxSize = maxSize;
        buffer = new LinkedList<Object>();
        lock = new ReentrantLock();
        fullCondition = lock.newCondition();
        notFullCondition = lock.newCondition();
    }

    /**
     * 生产者
     * @param obj
     * @throws InterruptedException
     */
    public void put(Object obj) throws InterruptedException {
        lock.lock();    //获取锁
        try {
            while (maxSize == buffer.size()){
                System.out.println("满了，添加的线程进入等待状态");
                notFullCondition.await();       //满了，添加的线程进入等待状态
            }
            buffer.add(obj);
            fullCondition.signal(); //通知
        } finally {
            lock.unlock();
        }
    }

    /**
     * 消费者
     * @return
     * @throws InterruptedException
     */
    public Object get() throws InterruptedException {
        Object obj;
        lock.lock();
        try {
            while (buffer.size() == 0){ //队列中没有数据了 线程进入等待状态
                System.out.println("队列中没有数据了 线程进入等待状态");
                fullCondition.await();
            }
            obj = buffer.poll();
            notFullCondition.signal(); //通知
        } finally {
            lock.unlock();
        }
        return obj;
    }
}
