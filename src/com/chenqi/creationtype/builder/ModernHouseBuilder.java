package com.chenqi.creationtype.builder;

/**
 * @Description : 现代风格房屋(ConcreteBuilder2)
 * @Author : chen qi
 * @Date: 2021-03-22 16:48
 */
public class ModernHouseBuilder implements HouseBuilder {

    private House house;

    public ModernHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Modern Walls");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Modern Doors");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Modern Windows");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Modern Roof");
    }

    @Override
    public House getResult() {
        return this.house;
    }

    @Override
    public String toString() {
        return "ModernHouseBuilder{" +
                "house=" + this.house +
                '}';
    }
}
