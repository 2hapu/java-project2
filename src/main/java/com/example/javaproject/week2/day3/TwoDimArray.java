package com.example.javaproject.week2.day3;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // 2차원 배열 선언
        int[] arr0 = arr[0]; // 2차원 배열에서 꺼내 1차원 배열에 할당
        arr0[0] = 1; // 값 할당

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
