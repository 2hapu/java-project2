package com.example.javaproject.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class WidthArrEx {
    // 행 번호 입력시 해당 행의 값을 1로 넣어주는 메소드
    public static void fillARow(int[][] arr, int rowNum) {
        arr[rowNum][0] = 1;
        arr[rowNum][1] = 1;
        arr[rowNum][2] = 1;
        arr[rowNum][3] = 1;
        arr[rowNum][4] = 1;
        printTwoDimArr(arr);
    }

    public static void printTwoDimArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("-------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillARow(arr, 1);   // index 1 행에 1을 넣어줌
        fillARow(arr, 2);   // index 1,2 행에 1을 넣어줌 (값이 쌓여서)

    }

}
