package com.chenqi.creational.builder;

/**
 * @Description : 客户(Client)
 * @Author : chen qi
 * @Date: 2021-03-22 17:42
 */
public class Client {
    public static void main(String[] args) {
        ModernHouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        Director director = new Director(modernHouseBuilder);
        director.make();
        System.out.println(modernHouseBuilder.toString());

        MinimalistHouseBuilder minimalistHouseBuilder = new MinimalistHouseBuilder();
        director.changeBuilder(minimalistHouseBuilder);
        director.make();
        System.out.println(minimalistHouseBuilder.toString());
    }
}
