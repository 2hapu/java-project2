package com.example.javaproject.week6.day5.circle2;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14159;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 3.14159 * 2;
    }
}
