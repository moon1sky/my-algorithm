package com.thread.ttl_test;

public class PayContextHolder {
    private static final ThreadLocal<String> payContext = new ThreadLocal<>();

    public static String getPayValue(){
        return payContext.get();
    }
    public static void setPayValue(String value){
        payContext.set(value);
    }
    public static void remove(){
        payContext.remove();
    }







}
