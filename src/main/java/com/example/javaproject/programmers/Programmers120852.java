package com.example.javaproject.programmers;

import com.example.javaproject.week3.baby.Array;

import java.util.Arrays;

public class Programmers120852 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/120852
        public static void main(String[] args) {
            // 시간복잡도 O(n)
            int n = 12;
            int divisor = 2;
            int[] arr = new int[n + 1]; // 12개나 만들어야하나?
            int idx = 0;

            while(n > 1){
                if (n % divisor == 0) { // 나누어 떨어지는지?
                    arr[idx++] = divisor;
                    n /= divisor;
                } else {
                    // 12 --> 6 --> 3 인경우 2로 안나누어떨어짐
                    divisor++;
                }
            }

            for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
        }
    }

