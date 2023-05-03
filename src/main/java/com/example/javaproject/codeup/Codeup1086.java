package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextLong();
        double g = sc.nextLong();
        double b = sc.nextLong();

        double mb = r * g * (b/8) / 1024 / 1024;
        System.out.printf("%.2f MB", mb);
    }
}
