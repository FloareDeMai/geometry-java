package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {
    private double a;
    public EquilateralTriangle(double a) {
        super(a, a, a);
        this.a = a;
    }

    @Override
    public String toString() {
        return "Equilateral Triangle, " +
                " a = " + a;
    }
}
