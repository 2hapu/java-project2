package com.example.javaproject.week4.day1;

import java.util.Scanner;

public class RightTriangleStars {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
