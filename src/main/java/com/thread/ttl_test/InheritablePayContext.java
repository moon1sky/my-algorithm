package com.thread.ttl_test;

public class InheritablePayContext {
    private static final InheritableThreadLocal<String> childPayContext = new InheritableThreadLocal<>();

    public static String getChildPayValue() {
        return childPayContext.get();
    }

    public static void setChildPayValue(String value) {
        childPayContext.set(value);
    }

    public static void removeChild() {
        childPayContext.remove();
    }
}
