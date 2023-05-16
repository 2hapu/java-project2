package com.example.javaproject.week5.day2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {11, 5, 7, 14, 30, 19};

        for (int j = 0; j < arr.length - 1; j++) {
            int targetVal = arr[j];
            int targetIdx = j;
            for (int i = j + 1; i < arr.length; i++) {
                if(targetVal > arr[i]){
                    targetVal = arr[i];
                    targetIdx = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[targetIdx];
            arr[targetIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
