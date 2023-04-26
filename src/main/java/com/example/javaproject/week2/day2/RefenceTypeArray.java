package com.example.javaproject.week2.day2;

import java.util.List;

public class RefenceTypeArray {
    public static void main(String[] args) {
        String[] sArr = new String[3];
        System.out.println(sArr[0]);
        sArr[0].split(" "); // nullPointException
    }
}
