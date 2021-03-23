package com.chenqi.creationtype.singleton;

/**
 * @Description : 单例模式-内部类
 * @Author : chen qi
 * @Date: 2021-03-23 18:29
 */
public class Singleton04 {

    private Singleton04() {

    }

    public Singleton04 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton04 instance = new Singleton04();
    }
}
