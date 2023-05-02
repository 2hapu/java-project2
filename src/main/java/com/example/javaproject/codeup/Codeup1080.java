package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int i = 0;
        int sum = 0;
        for(i = 0; i <= iVal; i++){
            sum += i;
            if(sum >= iVal){
                break;
            }
        }
        System.out.println(i);

    }

}
