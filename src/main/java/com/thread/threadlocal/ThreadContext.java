package com.thread.threadlocal;

public class ThreadContext {

    final private static ThreadLocal<String> context = new ThreadLocal<>();

    final private static InheritableThreadLocal<String> parentContext = new InheritableThreadLocal<>();

    final public static String getUserDetail() {
        return context.get() != null ? context.get() : parentContext.get();
    }

    final public static void setUserDetail(String userDetail) {
        context.set(userDetail);
    }

    final public static void clear() {
        context.remove();
    }
}
