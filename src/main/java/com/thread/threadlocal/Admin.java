package com.thread.threadlocal;

public class Admin {
    public static void main(String[] args) {

        String ss  = "12123";
        ThreadContext.setUserDetail(ss);
        try {
            String userDetail = ThreadContext.getUserDetail();
            System.out.println("可以拿到user："+userDetail);
            new ThreadTest().start();
        }finally {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ThreadContext.clear();
        }

//        func1();
//        Thread thread = Thread.currentThread();
//        System.gc();
//        System.out.println(thread);
    }

    private static void func1() {
        ThreadLocal tl = new ThreadLocal<Integer>(); //line1
        tl.set(100);   //line2
        tl.get();       //line3
    }

    static class ThreadTest extends Thread{
        @Override
        public void run(){
            String userDetail = ThreadContext.getUserDetail();
            System.out.println("能拿到user吗:"+userDetail);
        }
    }

}
