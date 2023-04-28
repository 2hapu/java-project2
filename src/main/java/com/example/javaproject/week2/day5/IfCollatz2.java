package com.example.javaproject.week2.day5;

import java.util.Scanner;

public class IfCollatz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int i = 0;
        for(i = 0; i <= 500; i++){
            if(num != 1 && num % 2 == 0){
                num = num / 2;
            }
            else if(num != 1 && num % 2 != 0){
                num = num * 3 + 1;
            }
            else if(num == 1){
                System.out.println(1);
                break;
            }
            }
        if(i >= 500){
            System.out.println(-1);

        }

    }
}
