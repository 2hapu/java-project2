package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String dateInfo[] = date.split("\\.");


        int year = Integer.parseInt(dateInfo[0]);
        int month = Integer.parseInt(dateInfo[1]);
        int day = Integer.parseInt(dateInfo[2]);

        System.out.printf("%02d-%02d-%04d",day, month, year);

    }
}
