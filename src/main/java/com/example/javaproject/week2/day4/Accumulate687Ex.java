package com.example.javaproject.week2.day4;

public class Accumulate687Ex {
        public static void main(String[] args) {
            int num = 687;
            int answer = 0;

            answer += num % 10;
            num = num/10;
            System.out.println(answer);

            answer += num % 10;
            num = num/10;
            System.out.println(answer);

            answer += num % 10;
            num = num/10;
            System.out.println(answer);
        }
    }

