package com.chenqi.creational.prototype;

/**
 * @Description : 测试
 * @Author : chen qi
 * @Date: 2021-03-24 16:23
 */
public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setColor("red");
        circle.setRadius(20);

        Circle clone = circle.clone();
        System.out.println("circle equals circle-clone:" + (circle.equals(clone)));

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(10);
        rectangle.setX(1);
        rectangle.setY(1);
        rectangle.setColor("black");

        Rectangle clone1 = rectangle.clone();
        System.out.println("rectangle equals rectangle-clone:" + (rectangle.equals(clone1)));
    }
}
