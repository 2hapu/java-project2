package com.example.javaproject.week3.day3;

public class OddSum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.printf("홀수의 합 : %d\n", sum);
    }
}
