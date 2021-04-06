package com.chenqi.structural.adapter;

/**
 * @Description : 方钉
 * @Author : chen qi
 * @Date: 2021-04-06 15:47
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquare() {
        return this.width * this.width;
    }
}
