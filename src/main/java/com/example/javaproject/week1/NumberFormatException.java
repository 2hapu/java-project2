package com.example.javaproject.week1;

public class NumberFormatException {
    public static void main(String[] args) {
        String str = "123ab";
        int num = Integer.parseInt(str);
    }
}
