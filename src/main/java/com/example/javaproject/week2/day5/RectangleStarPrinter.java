package com.example.javaproject.week2.day5;

import java.util.Scanner;

public class RectangleStarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i < b; i++){
            for(j = 1; j <= a; j++){
                System.out.print("*");
            }
            if(j != a) {
                System.out.println();
            }
        }
    }
}
