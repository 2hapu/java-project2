package com.example.javaproject.week2.day3;

import java.util.Arrays;

public class WidthArr {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[3][0] = 1;
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[3][3] = 1;
        arr[3][4] = 1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
}
