package com.chenqi.creational.prototype;

import java.util.Objects;

/**
 * @Description : 通用形状
 * @Author : chen qi
 * @Date: 2021-03-24 16:05
 */
public class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {

    }

    public Shape(Shape shape) {
        if (null != shape) {
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x &&
                y == shape.y &&
                Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
