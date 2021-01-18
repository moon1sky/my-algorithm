package com.pattern;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
//        int corePoolSize,
//        int maximumPoolSize,
//        long keepAliveTime,
//        TimeUnit unit,
//        BlockingQueue<Runnable> workQueue
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,10,60,TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new ThreadFactory() {

                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r,"group");
                    }
                },
                new ThreadPoolExecutor.AbortPolicy()
                );


    }
}
