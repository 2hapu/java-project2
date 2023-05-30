package com.example.javaproject.week7.day2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 || year % 400 == 0){
            if(year % 100 == 0){
                System.out.printf("%d = 평년\n", year);
            } else {
                System.out.printf("%d = 윤년\n", year);
            }
        } else {
            System.out.printf("%d = 예외 해\n", year);
        }
    }
}
