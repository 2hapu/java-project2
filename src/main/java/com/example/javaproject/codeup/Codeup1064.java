package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal1 = sc.nextInt();
        int inputVal2 = sc.nextInt();
        int inputVal3 = sc.nextInt();

        int iVal1 = (inputVal1 < inputVal2 ? inputVal1 : inputVal2);
        int iVal2 = (iVal1 < inputVal3 ? iVal1 : inputVal3);
        System.out.println(iVal2);
    }
}
