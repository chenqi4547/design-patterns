package com.chenqi.creationtype.factorymethod;

/**
 * @Description : TODO
 * @Author : chen qi
 * @Date: 2021-03-17 12:06
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
