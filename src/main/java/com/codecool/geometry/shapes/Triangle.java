package com.codecool.geometry.shapes;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        if(isValid(a, b, c)){
            double s = (a + b + c)/2;
            double result = Math.sqrt(s*(s - a)*(s - b)*(s - c));
            return Math.round(result*100.0)/100.0;
        }else{
            System.out.println("Invalid triangle");
            return 0;
        }


    }

    @Override
    public double calculatePerimeter() {
        double result =  a + b + c;
        return Math.round(result*100.0)/100.0;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", a = " + String.format("%.2f", a) +
                ", b = " + String.format("%.2f", b) +
                ", c = " + String.format("%.2f", c);
    }

    private static boolean isValid(double a, double b, double c){
        return a + b > c && b + c > a && a + c > b;
    }
}
