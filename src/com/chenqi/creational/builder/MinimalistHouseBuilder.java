package com.chenqi.creational.builder;

/**
 * @Description : 简约风格房屋(ConcreteBuilder1)
 * @Author : chen qi
 * @Date: 2021-03-22 16:47
 */
public class MinimalistHouseBuilder implements HouseBuilder {

    private House house;

    public MinimalistHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Minimalist Walls");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Minimalist Doors");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Minimalist Windows");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Minimalist Roof");
    }

    @Override
    public House getResult() {
        return this.house;
    }

    @Override
    public String toString() {
        return "MinimalistHouseBuilder{" +
                "house=" + this.house +
                '}';
    }
}
