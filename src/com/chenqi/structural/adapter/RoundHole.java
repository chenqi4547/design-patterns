package com.chenqi.structural.adapter;

/**
 * @Description : 圆孔
 * @Author : chen qi
 * @Date: 2021-04-06 15:46
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
