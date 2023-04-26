package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cVal = sc.next().charAt(0);
        int iVal = (int)cVal + 1;
        char nextCVal = (char)iVal;
        System.out.println(nextCVal);
    }
}
