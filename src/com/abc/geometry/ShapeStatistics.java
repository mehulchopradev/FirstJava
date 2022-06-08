package com.abc.geometry;

import com.abc.geometry.entities.Shape;

public class ShapeStatistics {

    public static void print(Shape shape) {
        System.out.println("********************** Statistics *******************");
        System.out.println(String.format("Area is %s", shape.area()));
        System.out.println(String.format("Perimeter is %s", shape.perimeter()));
        System.out.println("******************** Statistics ****************");
    }
}
