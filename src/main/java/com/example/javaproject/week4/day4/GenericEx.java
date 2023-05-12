package com.example.javaproject.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        // 문자형
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("1004");

        // 정수형
        List<Integer> intList = new ArrayList<>();
        intList.add(1004);
        intList.add(1004);

        for(String item : strList){
            System.out.println(item);
        }

        for (int item : intList) {
            System.out.println(item);
        }
    }
}
