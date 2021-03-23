package com.chenqi.creationtype.singleton;

/**
 * @Description : 懒汉式（线程安全）
 * @Author : chen qi
 * @Date: 2021-03-23 18:23
 */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {

    }

    public static synchronized Singleton03 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton03();
        return instance;
    }
}
