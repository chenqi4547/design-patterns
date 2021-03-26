package com.chenqi.creational.singleton;

/**
 * @Description : 单例-双重校验锁
 * @Author : chen qi
 * @Date: 2021-03-23 18:35
 */
public class Singleton05 {

    private static volatile Singleton05 instance;

    private Singleton05() {

    }

    public static Singleton05 getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton05.class) {
            if (null == instance) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
