package com.blankj.concurrent;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
public class ConditionUseCase {

    public Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public static void main(String[] args)  {
        ConditionUseCase useCase = new ConditionUseCase();
        ExecutorService executorService = Executors.newFixedThreadPool (2);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                useCase.conditionWait();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                useCase.conditionSignal();
            }
        });
    }

    public void conditionWait()  {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "拿到锁了");
            System.out.println(Thread.currentThread().getName() + "等待信号");
            condition.await();
            System.out.println(Thread.currentThread().getName() + "拿到信号");
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
    public void conditionSignal() {
        lock.lock();
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "拿到锁了");
            condition.signal();
            System.out.println(Thread.currentThread().getName() + "发出信号");
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

}
