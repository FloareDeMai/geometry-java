package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {
    private final double a;

    public RegularPentagon(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*a*Math.sqrt(5*(5+2*Math.sqrt(5)))/4;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * a;
    }

    @Override
    public String toString() {
        return "Pentagon" +
                ", a = " + a;
    }
}
