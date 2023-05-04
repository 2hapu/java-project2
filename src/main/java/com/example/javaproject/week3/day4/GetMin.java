package com.example.javaproject.week3.day4;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 8, 7};

        // 최소값 구하기
        int targetValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(targetValue > arr[i]){
                targetValue = arr[i];
            }
        }
        System.out.println(targetValue);
    }
}
