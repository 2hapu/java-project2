package com.example.javaproject.week3.day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int answer = 1; // 0으로 하면 안됨

        for(int i = iVal; i >= 1; i--){
            answer *= i;
        }
        System.out.println(answer);
    }
}
