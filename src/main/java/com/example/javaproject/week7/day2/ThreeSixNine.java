package com.example.javaproject.week7.day2;

import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        int num1 = 32;
        int num2 = 55535;


        for(int i = 1; i <= num; i = i * 10) {
            for(int j = 0; j <= num; j++) {
                if(num % i == 3 || num % i == 6 || num % i == 9){
                    System.out.print(j + "+");
            }
                System.out.print(j);
            }
        }
    }
}
