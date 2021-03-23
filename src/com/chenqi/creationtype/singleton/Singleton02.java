package com.chenqi.creationtype.singleton;

/**
 * @Description : 单例模式-懒汉式（线程不安全）
 * @Author : chen qi
 * @Date: 2021-03-23 18:19
 */
public class Singleton02 {

    private static Singleton02 instance;

    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton02();
        return instance;
    }
}
