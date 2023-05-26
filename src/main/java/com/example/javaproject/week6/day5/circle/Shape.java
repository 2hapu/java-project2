package com.example.javaproject.week6.day5.circle;

public interface Shape {
    double calculateArea();

    default void display(){
        System.out.println("디폴트 메서드를 사용할 수도 있다..? 무조건 추상 메서드만 구현해야하는 것은 아니다");
    }
}
