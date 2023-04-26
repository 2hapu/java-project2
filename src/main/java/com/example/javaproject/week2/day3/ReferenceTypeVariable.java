package com.example.javaproject.week2.day3;

import com.example.javaproject.week1.PrintHello;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        Student student = new Student(); // new를 써서 Student객체를 인스턴스로

        Student[] students = new Student[30];

        Object obj = new Student();
        Object obj2 = new PrintHello();

         // primitive 타입은 클래스가 아님 / 모든 클래스는 타입이 되지만 모든 타입이 클래스인 건 아님
    }
}
