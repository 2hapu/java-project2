package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1037 {
    // 정수 -> 아스키 문자 0~255까지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte bValue = (byte)sc.nextInt();

        System.out.println((char)bValue);
    }
}
