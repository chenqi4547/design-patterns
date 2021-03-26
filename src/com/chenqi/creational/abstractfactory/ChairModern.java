package com.chenqi.creational.abstractfactory;

/**
 * @Description : ConcreteProductA1
 * @Author : chen qi
 * @Date: 2021-03-17 16:12
 */
public class ChairModern implements Chair {
    @Override
    public void chair() {
        System.out.println("Modern chair!");
    }
}
