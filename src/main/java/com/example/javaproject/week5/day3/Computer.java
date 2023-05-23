package com.example.javaproject.week5.day3;

public class Computer extends Product{

    public Computer(int price){
        super(price);
    }
    @Override
    void print() {
        System.out.println("나 컴퓨터");
    }

}