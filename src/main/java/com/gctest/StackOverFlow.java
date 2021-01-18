package com.gctest;

public class StackOverFlow {
    public static void main(String[] args) {
        while (true) {
            stackOverFlow();
        }
    }

    public static void stackOverFlow() {
        int i = 0;
        i++;
    }
}
