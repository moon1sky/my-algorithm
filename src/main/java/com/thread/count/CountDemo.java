package com.thread.count;

import java.util.concurrent.atomic.AtomicInteger;

public class CountDemo {

    private static volatile AtomicInteger atomicInteger = new AtomicInteger(0);
    private static volatile Integer integer = new Integer(0);
    private static int count = 10000;

    public static void main(String[] args) {
        for (int i = 0; i < count; i++) {
            new Thread(()->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                integer++;
                atomicInteger.incrementAndGet();
            }).start();
        }
//        System.out.println(integer);
        System.out.println(atomicInteger);
    }


}
