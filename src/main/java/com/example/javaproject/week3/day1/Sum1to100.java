package com.example.javaproject.week3.day1;

public class Sum1to100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum += sum;
            System.out.println(sum);
        }
    }
}
