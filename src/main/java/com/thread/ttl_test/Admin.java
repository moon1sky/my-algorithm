package com.thread.ttl_test;

import java.util.concurrent.*;

public class Admin {

//    private static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,4, 120,TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));

    private static ExecutorService poolExecutor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        PayContextHolder.setPayValue("pay-test");
        String payValue1 = PayContextHolder.getPayValue();
        System.out.println("Paraent-value1="+payValue1);

        new Thread(()->{
            String payValue2 = PayContextHolder.getPayValue();
            System.out.println("Paraent-value1="+payValue1);
            System.out.println("Paraent-value2="+payValue2);
        }).start();


        InheritablePayContext.setChildPayValue("pay-test");
        String payChildValue1 = InheritablePayContext.getChildPayValue();
        System.out.println("Paraent-value1="+payChildValue1);

        new Thread(()->{
            String payValue2 = InheritablePayContext.getChildPayValue();
            System.out.println("Paraent-value1="+payChildValue1);
            System.out.println("Paraent-value2="+payValue2);
            poolExecutor.execute(()->{
                String payValue3 = InheritablePayContext.getChildPayValue();
                System.out.println("Paraent-value3="+payValue3);

                String payValue4 = PayContextHolder.getPayValue();
                System.out.println("payValue4="+payValue4);
            });

        }).start();



    }


    public static class MyThread extends Thread{

        @Override
        public void run() {




        }
    }

}
