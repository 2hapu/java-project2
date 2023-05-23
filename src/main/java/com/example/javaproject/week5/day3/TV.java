package com.example.javaproject.week5.day3;

public class TV extends Product{
    public TV(int price) {
        super(price);
    }

    @Override
    void print() {
        System.out.println("나 TV");
    }

    void test() {
        System.out.println("티비 테스트");
    }
}
