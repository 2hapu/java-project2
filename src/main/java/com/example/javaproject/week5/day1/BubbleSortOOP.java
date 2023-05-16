package com.example.javaproject.week5.day1;

import java.util.Arrays;

public class BubbleSortOOP {

    public int[] sortAround(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for (int j = 1; j < arr.length; j++) {
            arr = sortAround(arr, arr.length - j);
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSortOOP bubbleSort02 = new BubbleSortOOP();
        int[] arr = {14, 2, 5, 17, 29, 11};

        arr = bubbleSort02.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
