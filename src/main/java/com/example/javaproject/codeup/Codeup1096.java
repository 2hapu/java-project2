package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[20][20];
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int x = sc. nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
        }
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
