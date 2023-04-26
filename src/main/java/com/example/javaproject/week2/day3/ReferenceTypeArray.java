package com.example.javaproject.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "이용준";
        students[0].phoneNumber = "010-1234-1234";
        students[0].age = 26;

        students[1] = new Student();
        students[1].name = "이용순";
        students[1].phoneNumber = "010-1235-1235";
        students[1].age = 25;
    }
}
