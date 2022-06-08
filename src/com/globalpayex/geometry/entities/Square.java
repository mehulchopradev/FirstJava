package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

// Developer X
public class Square extends Shape {

    int side;

    public Square(int side) {
        this.side = side;
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}
