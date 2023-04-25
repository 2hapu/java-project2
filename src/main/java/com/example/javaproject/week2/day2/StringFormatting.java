package com.example.javaproject.week2.day2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "이용준";
        int balance = 2_000_0000;
        String result = String.format("%s님의 통장 잔고는 %d원 입니다.",name, balance);
        System.out.println(result);

    }
}
