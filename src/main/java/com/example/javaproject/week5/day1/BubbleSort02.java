package com.example.javaproject.week5.day1;

import com.example.javaproject.week3.baby.Array;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        BubbleSort02 bubbleSort02 = new BubbleSort02();
        arr = bubbleSort02.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
