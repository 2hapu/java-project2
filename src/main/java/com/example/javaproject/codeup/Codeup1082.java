package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int hexVal = Integer.parseInt("B”, 16); → 16진수 값
        //%x → 16진수로 출력
        int iVal = Integer.parseInt(sc.next(), 16);
        for(int i = 1; i <= 15; i++){
            System.out.printf("%X*%X=%X\n", iVal, i, iVal*i);
        }

    }
}
