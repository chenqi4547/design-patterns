package com.chenqi.creationtype.singleton;

/**
 * @Description : 单例模式-饿汉式（线程安全）
 * @Author : chen qi
 * @Date: 2021-03-23 18:05
 */
public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
