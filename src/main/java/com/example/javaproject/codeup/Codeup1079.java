package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            char cVal = sc.next().charAt(0);
            if(cVal =='q')
            {
                System.out.println(cVal);
                break;
            }
            else
            {
                System.out.println(cVal);
            }
        }
    }
}