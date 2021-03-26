package com.chenqi.creational.abstractfactory;

/**
 * @Description : 复古风格家具工厂(ConcreteFactory2)
 * @Author : chen qi
 * @Date: 2021-03-17 16:06
 */
public class RetroFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ChairRetro();
    }

    @Override
    public Sofa createSofa() {
        return new SofaRetro();
    }
}
