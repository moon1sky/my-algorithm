package com.thread.waitandnotify;

import java.util.Random;

public class Admin {

    public static void main(String[] args) throws InterruptedException {
        //1.测试 wait 和 notify
//        testWait和Notify();


        //test Sleep
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //2.测试 生产者和消费者:利用wait和notify
        testConsumerAndProducer();


    }

    private static void testConsumerAndProducer() throws InterruptedException {
        Ticket ticket = new Ticket(10);

        Producer producer = new Producer(ticket);
        producer.start();

        Thread.sleep(100);

        for (int i = 0; i < 10; i++) {
            Consumer consumer1 = new Consumer(ticket);
            consumer1.setName("consumer"+i);
            Thread.sleep(10);
            consumer1.start();
        }

//        Consumer consumer1 = new Consumer(ticket);
//        consumer1.setName("consumer1");
//        consumer1.start();
//        Consumer consumer2 = new Consumer(ticket);
//        consumer2.setName("consumer2");
//        consumer2.start();
//        Consumer consumer3 = new Consumer(ticket);
//        consumer3.setName("consumer3");
//        consumer3.start();


    }

    private static void testWait和Notify() {
        Object obj = new Object();

        WaitThread waitThread = new WaitThread(obj);
        waitThread.start();


        NotifyThread notifyThread = new NotifyThread(obj);
        notifyThread.start();
    }
}
