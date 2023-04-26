package com.example.javaproject.week2.day3;

import java.util.Arrays;

public class TwoDimArrEx {
    // 메소드(method, 함수, function)
    // printArray 메소드에 parameter로 2차원 배열 값을 넣어 중복된 코드 refactoring
    // main에서 호출하기 위해 static 사용
    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("---------");

    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);
    }
}
