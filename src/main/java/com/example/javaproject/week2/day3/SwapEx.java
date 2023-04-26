package com.example.javaproject.week2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        // 오름차순으로 정렬
        int[] arr = {2, 1, 4, 7, 8, 6};

        int temp0 = arr[0]; //임시 변수
        int temp1 = arr[1];
        int temp3 = arr[3];
        int temp4 = arr[4];
        int temp5 = arr[5];
        arr[0] = temp1;
        arr[1] = temp0;
        arr[3] = temp5;
        arr[4] = temp3;
        arr[5] = temp4;

        System.out.println(Arrays.toString(arr));
    }
}
