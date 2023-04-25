package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String dateInfo[] = date.split(":");

        System.out.printf("%s:%s",dateInfo[0],dateInfo[1]);

    }
}

