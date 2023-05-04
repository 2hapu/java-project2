package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[23];
        int callVal = sc.nextInt();

        for (int i = 0; i < callVal; i++) {
            arr[sc.nextInt()-1] += 1;
        }

        for (int j = 0; j < 23; j++) {
            System.out.printf("%d ", arr[j]);
        }
    }
}
