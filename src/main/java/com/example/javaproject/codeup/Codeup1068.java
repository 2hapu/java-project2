package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();

        if(point >= 90){
            System.out.println("A");
        } else if (point >= 70){
            System.out.println("B");
        } else if(point >= 40){
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
