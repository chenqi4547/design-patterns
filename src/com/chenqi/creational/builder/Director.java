package com.chenqi.creational.builder;

/**
 * @Description : 主管(Director)
 * @Author : chen qi
 * @Date: 2021-03-22 17:29
 */
public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void make() {
        houseBuilder.buildWalls();
        houseBuilder.buildDoors();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();
    }

    public void changeBuilder(HouseBuilder builder) {
        this.houseBuilder = builder;
    }
}
