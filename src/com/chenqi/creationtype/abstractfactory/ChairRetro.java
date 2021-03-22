package com.chenqi.creationtype.abstractfactory;

/**
 * @Description : ConcreteProductA2
 * @Author : chen qi
 * @Date: 2021-03-17 16:13
 */
public class ChairRetro implements Chair {
    @Override
    public void chair() {
        System.out.println("Retro chair");
    }
}
