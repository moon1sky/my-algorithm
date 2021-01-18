package com.pattern;

import com.google.common.collect.Sets;

import java.util.Set;

public class Admin {

        public static volatile Admin instance=null;
//    public static Admin instance = null;


    private Admin() {

    }

    public static Admin getInstance() {
        if (instance == null) {
            synchronized (Admin.class) {
                if (instance == null) {
                    instance = new Admin();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) throws InterruptedException {
        Set<Admin> set = Sets.newHashSet();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Admin instance = Admin.getInstance();
                set.add(instance);
            }, "thread-" + i).start();
        }
        Thread.sleep(3000);
        System.out.println(set.size());
        for (Admin admin : set) {
            System.out.println(admin);
        }

    }

}
