package com.example.javaproject.week2.day4;

public class SumOfValues {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int answer = 0;

//        // 배운 내용
//
//        answer = answer + arr[0];
//        answer = answer + arr[1];
//        answer = answer + arr[2];
//        answer = answer + arr[3];
//        System.out.printf("%d\n", answer);

        // for문 활용
        for(int i = 0; i < arr.length; i ++) {
            answer += arr[i];
        }

        System.out.println(answer);
    }
}
