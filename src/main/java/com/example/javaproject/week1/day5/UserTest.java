package com.example.javaproject.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User yongjun = new User();
        yongjun.name = "이용준";
        yongjun.phoneNumber = "010-1234-1424";
        yongjun.age = 26;

        User jaesung = new User();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-0000-1235";
        jaesung.age = 25;

        System.out.printf("%s님은 성인입니까? %s\n", yongjun.name, yongjun.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
