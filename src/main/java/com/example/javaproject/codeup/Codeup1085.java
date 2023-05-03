package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hz = sc.nextInt();
        int bit = sc.nextInt();
        int channel = sc.nextInt();
        int sec = sc.nextInt();
        int byt = bit / 8;
        float mb = (float)(hz * byt * channel * sec) / 1024 / 1024;
        System.out.printf("%.1f MB", mb);
    }
}
