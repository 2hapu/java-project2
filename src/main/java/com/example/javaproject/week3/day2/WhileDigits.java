package com.example.javaproject.week3.day2;

public class WhileDigits {
    public static void main(String[] args) {
        int iVal = 153456;
        int digit = 0;
        while (iVal > 0){
            iVal = iVal / 10;
            digit++;
        }
        System.out.println(digit);
    }
}
