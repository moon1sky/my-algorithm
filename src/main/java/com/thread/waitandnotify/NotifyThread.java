package com.thread.waitandnotify;

public class NotifyThread extends Thread {

    private Object obj;

    NotifyThread(Object obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            System.out.println("notify start");
            obj.notify();
            System.out.println("notify end");
        }
    }
}
