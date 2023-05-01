package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        if(iVal > 0 && iVal <= 100){
            for (int i = iVal; i > 0; i--) {
                System.out.println(i);
            }
        }
    }
}
