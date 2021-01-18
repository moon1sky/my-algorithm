package com.thread.interrupt;

public class InterruptTest {

    private static int num;


    public static void main(String[] args) throws InterruptedException {



        Thread thread = new Thread(()->{
            while (true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("num="+num);
                    break;
                }
                num++;

            }

        },"my-thread");

        thread.start();

        Thread.sleep(100);
        System.out.println(Thread.currentThread().isInterrupted());
        thread.interrupt();
        System.out.println("enddddddddddddddddd");
        System.out.println(Thread.currentThread().isInterrupted());

        System.out.println(Thread.currentThread().getName());
        System.out.println(thread.getName());


    }
}
