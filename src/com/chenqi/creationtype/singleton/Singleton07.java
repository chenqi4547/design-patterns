package com.chenqi.creationtype.singleton;

/**
 * @Description : 枚举 Effective Java 作者推荐使⽤枚举的⽅式解决单例模式，此种⽅式可能是平时最少⽤到的。
 * 这种⽅式解决了最主要的；线程安全、⾃由串⾏化、单⼀实例。
 * 这种写法在功能上与共有域⽅法相近，但是它更简洁，⽆偿地提供了串⾏化机制，绝对防⽌对此实例
 * 化，即使是在⾯对复杂的串⾏化或者反射攻击的时候。虽然这中⽅法还没有⼴泛采⽤，但是单元素的枚
 * 举类型已经成为实现Singleton的最佳⽅法。
 * 但也要知道此种⽅式在存在继承场景下是不可⽤的。
 * @Author : chen qi
 * @Date: 2021-03-24 10:41
 */
public enum Singleton07 {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding");
    }
}
