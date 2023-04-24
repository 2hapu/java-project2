package com.example.javaproject.week2;

public class DivideIntoTwo {
    public static void main(String[] args) {
        // 1 + 1 / 2

        float fOne = 1;
        float fTwo = 2;

        System.out.printf("%f", fOne + fOne / fTwo);
        // 결과 : 1.500000

        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d\n", iOne + iOne / iTwo);
        // 결과 : 1

        System.out.printf("%d\n", 9 / 2);
        System.out.printf("%f\n", 9 / 2.0);
    }
}
