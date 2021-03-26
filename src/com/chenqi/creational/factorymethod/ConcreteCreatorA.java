package com.chenqi.creational.factorymethod;

/**
 * @Description : TODO
 * @Author : chen qi
 * @Date: 2021-03-17 12:05
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
