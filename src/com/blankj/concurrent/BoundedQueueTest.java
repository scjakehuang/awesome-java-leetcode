package com.blankj.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/22
 */
public class BoundedQueueTest {
    public static void main(String[] args) {
        BoundedQueue boundedQueue = new BoundedQueue(5);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            for (int i=0;i<10000;i++){
                try {
                    boundedQueue.put(new Object());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(()->{
            for (int i=0;i<10000;i++){
                try {
                    boundedQueue.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
