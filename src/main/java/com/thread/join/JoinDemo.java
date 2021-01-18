package com.thread.join;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setName("MyThread1111");
        t.start();
        t.join(100);


        MyThread t2 = new MyThread();
        t2.setName("MyThread2222");
        t2.start();
//        t2.join(100);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ " runing : "+i);
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ " runing : "+i);
        }
    }
}
