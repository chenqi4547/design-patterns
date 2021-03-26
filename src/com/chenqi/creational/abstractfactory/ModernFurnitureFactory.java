package com.chenqi.creational.abstractfactory;

/**
 * @Description : 现代风格家具工厂(ConcreteFactory1)
 * @Author : chen qi
 * @Date: 2021-03-17 16:05
 */
public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ChairModern();
    }

    @Override
    public Sofa createSofa() {
        return new SofaModern();
    }
}
