package com.example.javaproject.week3.day3;

import java.util.Scanner;

public class IsPrimeRoot {
    public static void main(String[] args) {
        int num = 17;
        int factors = 0; // 약수의 개수
        for (int i = 2; i * i <= num; i++) { // 1과 num은 당연히 나누어떨어지므로 제외
            if(num % i == 0) {
                factors++;
            }
        }
        System.out.printf("factors:%d\n", factors);
        System.out.println(factors == 0 ? num + "은 소수입니다.":num + "은 소수가 아닙니다.");
    }
}
