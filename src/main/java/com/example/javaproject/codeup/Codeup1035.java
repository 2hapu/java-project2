package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //10진수 -> 16진수 -> 8진수
        System.out.println(Integer.toOctalString(Integer.valueOf(sc.next(),16)));
    }
}


