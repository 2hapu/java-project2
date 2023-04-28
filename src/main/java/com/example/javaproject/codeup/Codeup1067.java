package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 음(minus)/양(plus)과 짝(even)/홀(odd)
        int num = sc.nextInt();

        if(num < 0) {
            System.out.println("minus");
            if(num % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("plus");
            if(num % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
