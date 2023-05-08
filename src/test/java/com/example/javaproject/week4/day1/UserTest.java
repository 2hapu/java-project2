package com.example.javaproject.week4.day1;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {

    User user1 = new User();
        user1.name = "이용준";
        user1.age = 20;
        user1.phoneNumber = "01084541234";

    User user2 = new User();
        user2.name = "이용순";
        user2.age = 12;
        user2.phoneNumber = "01084541111";

        System.out.printf("%s는 성인입니까? : %b\n",user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? : %b\n",user2.name, user2.isAdult());

    }
}