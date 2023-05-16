package com.example.javaproject.week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {11, 5, 7, 14, 30, 19};
        // i j i-1
        // 1 1 0
        // 2 2 1
        // 2 1 2
        // 3 3 2
        // 3 2 1
        // 3 1 0
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
