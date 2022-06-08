package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

// Developer Y
public class Rectangle extends Shape {

    int length;

    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
