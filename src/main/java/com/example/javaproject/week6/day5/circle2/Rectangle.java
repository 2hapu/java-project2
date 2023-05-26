package com.example.javaproject.week6.day5.circle2;

public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (width + height) * 2;
    }

    @Override
    public double calculatePerimeter() {
        return width * height;
    }
}
