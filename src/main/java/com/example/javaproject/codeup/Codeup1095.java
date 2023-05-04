package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callVal = sc.nextInt();
        int fastNum = 23;
        for (int i = 0; i < callVal; i++) {
            int num = sc.nextInt();
            if(fastNum > num){
                fastNum = num;
            }
        }
        System.out.println(fastNum);
    }
}
