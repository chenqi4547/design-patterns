package com.chenqi.creationtype.singleton;

/**
 * @Description : test
 * @Author : chen qi
 * @Date: 2021-03-24 14:44
 */
public class SingletonTest {
    public static void main(String[] args) {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
    }

    public static void test01() {
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance1 = Singleton01.getInstance();
        System.out.println(instance.equals(instance1));
    }

    public static void test02() {
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance1 = Singleton02.getInstance();
        System.out.println(instance.equals(instance1));
    }

    public static void test03() {
        Singleton03 instance = Singleton03.getInstance();
        Singleton03 instance1 = Singleton03.getInstance();
        System.out.println(instance.equals(instance1));
    }

    public static void test04() {
        Singleton04 instance = Singleton04.getInstance();
        Singleton04 instance1 = Singleton04.getInstance();
        System.out.println(instance.equals(instance1));
    }

    public static void test05() {
        Singleton05 instance = Singleton05.getInstance();
        Singleton05 instance1 = Singleton05.getInstance();
        System.out.println(instance.equals(instance1));
    }

    public static void test06() {
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance1 = Singleton06.getInstance();
        System.out.println(instance.equals(instance1));
    }

    public static void test07() {
        Singleton07 instance = Singleton07.INSTANCE;
        Singleton07 instance1 = Singleton07.INSTANCE;
        System.out.println(instance.equals(instance1));
    }
}
