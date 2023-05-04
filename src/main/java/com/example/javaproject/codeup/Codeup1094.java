package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callVal = sc.nextInt();
        int[] arr = new int[callVal];

        for (int i = callVal-1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < callVal; j++) {
            System.out.printf("%d ", arr[j]);
        }
    }
}
