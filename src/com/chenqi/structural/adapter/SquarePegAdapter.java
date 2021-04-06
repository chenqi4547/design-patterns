package com.chenqi.structural.adapter;

/**
 * @Description : 方钉适配器
 * @Author : chen qi
 * @Date: 2021-04-06 15:47
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // 外切圆的半径
        double radius = Math.sqrt(2) / 2 * peg.getWidth();
        return radius;
    }
}
