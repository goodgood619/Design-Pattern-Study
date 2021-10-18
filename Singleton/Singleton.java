package com.company.Singleton;

public class Singleton {
    private Singleton(){}

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getSingletonObject() {
        return SingletonHolder.INSTANCE;
    }
}
