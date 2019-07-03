package com.chryl.controller.test;

/**
 * Created By Chr on 2019/7/3.
 */
public class Circle extends Shape {

    //r
    private double r;
    //3.14
    double p = 3.14;

    @Override
    public double calculateArea(double r) {
        return p * r * r;
    }

    public static void main(String args[]) {
        double v = new Circle().calculateArea(2);
        System.out.println(v);
    }
}
