package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        for (int i = 1; i <= iVal; i++) {
            if(i % 3 == 0){
                System.out.printf("%s ", 'X');
            } else {
                System.out.printf("%d ",i);
            }
        }
    }
}
