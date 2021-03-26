package com.chenqi.creationtype.prototype;

import java.util.Objects;

/**
 * @Description : 简单形状
 * @Author : chen qi
 * @Date: 2021-03-24 16:08
 */
public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        if (null != circle) {
            this.radius = circle.radius;
        }
    }

    @Override
    protected Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
