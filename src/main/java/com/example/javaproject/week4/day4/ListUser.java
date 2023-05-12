package com.example.javaproject.week4.day4;

import com.example.javaproject.week4.day1.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("이용준", "010-1234-1243", 15);
        users.add(user1);
        User user2 = new User("이용순", "011-1234-1243", 45);
        users.add(user2);
        User user3 = new User("이옥자", "010-5234-1243", 66);
        users.add(user3);

        for(User user : users){
            System.out.printf("%s님의 전화번호는 %s이고, 나이는 %d세입니다.\n", user.getName(), user.getPhoneNumber(), user.getAge());
        }
        }
    }

