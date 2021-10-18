package com.codecool.geometry.shapes;

public class Square extends Rectangle {
    private double a;
    public Square(double a) {
        super(a, a);
        this.a = a;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", a = " + String.format("%.2f", a);
    }
}
