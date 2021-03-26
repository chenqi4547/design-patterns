package com.chenqi.creational.builder;

/**
 * @Description : 房屋(Product)
 * @Author : chen qi
 * @Date: 2021-03-22 16:51
 */
public class House {
    private String walls;
    private String doors;
    private String windows;
    private String roof;

    public House() {
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
