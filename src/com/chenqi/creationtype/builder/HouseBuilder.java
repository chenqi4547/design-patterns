package com.chenqi.creationtype.builder;

/**
 * @Description : 房屋 (Builder)
 * @Author : chen qi
 * @Date: 2021-03-22 16:44
 */
public interface HouseBuilder {
    void reset();
    void buildWalls();
    void buildDoors();
    void buildWindows();
    void buildRoof();
    House getResult();
}
