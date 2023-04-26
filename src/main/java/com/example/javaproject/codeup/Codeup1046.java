package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        System.out.println(iVal1 + iVal2 + iVal3);
        System.out.printf("%.1f",(float)(iVal1 + iVal2 + iVal3) / 3);
    }
}
