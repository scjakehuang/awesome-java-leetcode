package com.blankj.myself;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/28
 */
public class ThreeThreadPrint {

    public static void main(String[] args) throws InterruptedException {
        String a = "sahjfhasjfhakjfhkjh";
        char[] arry = a.toCharArray();
        AtomicInteger index = new AtomicInteger();
        ReentrantLock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();


        new Thread(()->{
            Boolean finish = false;

            try {

                lock.lock();
                while (!finish) {

                    System.out.println(Thread.currentThread().getName() + ":   " + arry[index.getAndAdd(1)]);
                    condition2.signal();
                    condition1.await();

                    if (index.get() > arry.length) {
                        finish = true;
                    }
                }

            }catch (Exception e){

            }finally {
                lock.unlock();
            }

        }).start();


        new Thread(()->{
            Boolean finish = false;

            try {
                lock.lock();
                while (!finish) {
                    System.out.println(Thread.currentThread().getName() + ":   " + arry[index.getAndAdd(1)]);

                    condition3.signal();
                    condition2.await();

                    if (index.get() > arry.length) {
                        finish = true;
                    }
                }

            }catch (Exception e){

            }finally {
                lock.unlock();
            }



        }).start();

        new Thread(()->{
            Boolean finish = false;

            try {
                lock.lock();
                while (!finish) {
                    System.out.println(Thread.currentThread().getName() + ":   " + arry[index.getAndAdd(1)]);

                    condition1.signal();
                    condition3.await();

                    if (index.get() > arry.length) {
                        finish = true;
                    }
                }

            }catch (Exception e){

            }finally {
                lock.unlock();
            }



        }).start();


        Thread.sleep(100000);
    }

}
