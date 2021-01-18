package com.thread.aqs;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockDemo {

    private static ReentrantLock lock = new ReentrantLock();

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private static ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
    private static ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();

    private static Map cacheMap = new HashMap();

    public static void main(String[] args) throws InterruptedException {
        write("key","value");
        read("key");

        //
        lock.lock();
    }

    private final static Object read(String key) {
        readLock.lock();
        try {
            return cacheMap.get(key);
        } finally {
            readLock.unlock();
        }
    }

    private final static void write(String key, String value) {
        writeLock.lock();
        try {
            cacheMap.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }
}
