package com.example.javaproject.week3.day3;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            num = sc.nextInt();
            if(num != 0) System.out.println(num);
        } while (num != 0);
    }
}
