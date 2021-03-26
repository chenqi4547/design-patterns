package com.chenqi.creational.factorymethod;

/**
 * @Description : TODO
 * @Author : chen qi
 * @Date: 2021-03-17 13:57
 */
public class Test {
    private static Creator creator;

    public static void main(String[] args) {
        creator = new ConcreteCreatorA();
        creator.someOperate();
        creator = new ConcreteCreatorB();
        creator.someOperate();
    }
}
