package com.codecool.geometry.shapes;

public class Rectangle extends Shape {
    private final double a;
    private final double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }




    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", a = " + String.format("%.2f", a) + ", b = " + String.format("%.2f", b);
    }
}
