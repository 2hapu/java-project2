package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sVal = sc.next();
        int len = sVal.length();
        for(int i = 0; i < len; i++){
            System.out.printf("'%s'\n", sVal.charAt(i));
        }

    }
}
