package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int man1 = sc.nextInt();
        int man2 = sc.nextInt();
        int man3 = sc.nextInt();
        int day = 1;
        while (day%man1!=0 || day%man2!=0 || day%man3!=0){
            day++;
        }
        System.out.println(day);

    }
}
