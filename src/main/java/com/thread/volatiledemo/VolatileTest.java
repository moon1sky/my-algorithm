package com.thread.volatiledemo;

public class VolatileTest {

    private static volatile User user;

    public static User getInstance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public static void main(String[] args) {
        User instance = VolatileTest.getInstance();
        System.out.println("user==" + instance);
    }

    static class User {

    }
}
