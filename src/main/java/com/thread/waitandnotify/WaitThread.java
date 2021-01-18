package com.thread.waitandnotify;

import java.util.concurrent.TimeUnit;

public class WaitThread extends Thread {

    private Object obj;

    WaitThread(Object obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            System.out.println("wait start");
            try {
                obj.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait end");
        }
    }
}
