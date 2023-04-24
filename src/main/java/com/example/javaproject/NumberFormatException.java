package com.example.javaproject;

public class NumberFormatException {
    public static void main(String[] args) {
        String str = "123ab";
        int num = Integer.parseInt(str);
    }
}
