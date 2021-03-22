package com.chenqi.creationtype.abstractfactory;

/**
 * @Description : 家具抽象工厂(AbstractFactory)
 * @Author : chen qi
 * @Date: 2021-03-17 16:04
 */
public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();
}
