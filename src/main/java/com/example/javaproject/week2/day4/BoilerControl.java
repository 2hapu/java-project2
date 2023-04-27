package com.example.javaproject.week2.day4;

public class BoilerControl {
    public static void main(String[] args) {
        // 물 온도와 실내 온도가 각각 50, 24도 미만인지 확인하는 코드

        int waterTemp = 45; // 물 온도
        int roomTemp = 22; // 실내 온도

        boolean check = waterTemp < 50 && roomTemp < 24;
        System.out.printf("check : %b\n", check);

    }
}
