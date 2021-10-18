package com.codecool.geometry.shapes;

public class Circle extends Shape {

    private final double r;



    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return Math.round((2 * (2 * Math.PI * r)*100.000)/100.00);
    }

    @Override
    public double calculatePerimeter() {
        return  Math.round(((2 * Math.PI * r)*100.00)/100.00);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", r = " + String.format("%.2f", r);
    }

}
