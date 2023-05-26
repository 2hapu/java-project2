package com.example.javaproject.week6.day5;

public class Bird implements Ani,Shape{
    @Override
    public void makeSound() {
        System.out.println("왈왈");
    }

    @Override
    public void run() {
        System.out.println("shape");
    }
}
