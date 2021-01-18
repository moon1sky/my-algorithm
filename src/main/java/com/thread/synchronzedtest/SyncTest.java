package com.thread.synchronzedtest;

public class SyncTest implements Runnable {
    private static int num;

    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();
        for (int i = 0; i < 100; i++) {
            new Thread(syncTest).start();
        }
        System.out.println(num);
    }

    @Override
    public synchronized void run() {
        try {
            Thread.sleep(100);
            num++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
