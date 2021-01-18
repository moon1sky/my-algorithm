package com.thread.state;

import java.util.concurrent.TimeUnit;

public class ThreadStateTest {

//    NEW,
//
//    RUNNABLE,
//
//    BLOCKED,
//
//    WAITING,
//    TIMED_WAITING,
//
//    TERMINATED;

    public static void main(String[] args) {

        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "My-Thread-TIMED_WAITING").start();


        new Thread(() -> {
            while (true) {
                synchronized (ThreadStateTest.class) {
                    try {
                        ThreadStateTest.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }, "My-Thread-WAITING").start();


        new ThreadDemo().testThread("My-Thread-Blocked-1");
        new ThreadDemo().testThread("My-Thread-Blocked-2");


    }


    static class ThreadDemo {

        public void testThread(String threadName) {

            new Thread(() -> {
                while (true) {
                    synchronized (ThreadStateTest.class) {
                        try {
                            TimeUnit.SECONDS.sleep(100L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, threadName).start();

        }


    }
}
