package com.chenqi.creational.factorymethod;

/**
 * @Description : 工厂方法
 * @Author : chen qi
 * @Date: 2021-03-17 12:05
 */
public abstract class Creator {

    public void someOperate() {
        Product product = createProduct();
        product.doStuff();
    }

    abstract public Product createProduct();
}
