package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1090 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long r = sc.nextLong();
        long n = sc.nextLong();
        long sum = a;
        for (int i = 1; i < n; i++) {
            sum = sum * r;
        }
        System.out.println(sum);
    }
}
