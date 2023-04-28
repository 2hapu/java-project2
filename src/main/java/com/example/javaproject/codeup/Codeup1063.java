package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal1 = sc.nextInt();
        int inputVal2 = sc.nextInt();

        int iVal = (inputVal1 > inputVal2 ? inputVal1 : inputVal2);
        System.out.println(iVal);
    }
}
