package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

        long iStr1 = Long.parseLong(str[0]);
        long iStr2 = Long.parseLong(str[1]);

        System.out.println(iStr1 + iStr2);
    }
}