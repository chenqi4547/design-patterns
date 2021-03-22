package com.chenqi.creationtype.abstractfactory;

/**
 * @Description : 客户
 * @Author : chen qi
 * @Date: 2021-03-17 17:15
 */
public class Client {

    private Chair chair;
    private Sofa sofa;

    public Client(FurnitureFactory furnitureFactory) {
        chair = furnitureFactory.createChair();
        sofa = furnitureFactory.createSofa();
    }

    public void print() {
        chair.chair();
        sofa.sofa();
    }

    public static void main(String[] args) {
        Client modernClient = new Client(new ModernFurnitureFactory());
        modernClient.print();
        System.out.println();
        Client retroClient = new Client(new RetroFurnitureFactory());
        retroClient.print();
    }
}
