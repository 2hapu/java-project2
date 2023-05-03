package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int iVal1 = sc.nextInt();
        int iVal = 153456;
        int digit = 0;
        int sum = 0;
        int k = 0;
        while (iVal > 0){
            iVal = iVal / 10;
            digit++;
        }
        System.out.println(digit);
        int i = iVal;
        while(i < 1) {
            k = i % 10;
            i = i / 10;

            sum += k;
        }
        System.out.println(sum);
    }
}
