package com.example.javaproject.week2.day3;

import java.util.Arrays;

public class LengthArr {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][4] = 1;
        arr[1][4] = 1;
        arr[2][4] = 1;
        arr[3][4] = 1;
        arr[4][4] = 1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
}
