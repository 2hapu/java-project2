package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("winter");

        }
    }
}
