package com.example.javaproject.week5.day1;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {14, 2, 5, 17, 29, 11};

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
        }
    }
    }
