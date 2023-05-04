package com.example.javaproject.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();


        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
