package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;
        int x = 0;
        int y = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int now = sc.nextInt();
                if(maxValue < now){
                    maxValue = now;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d",x, y);

    }
}
