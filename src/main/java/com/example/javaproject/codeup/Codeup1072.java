package com.example.javaproject.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int[] arr = new int[iVal];

        for (int i = 0; i < iVal; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

    }
}
