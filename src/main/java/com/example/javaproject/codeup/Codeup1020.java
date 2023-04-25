package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String frontId = id.substring(0,6);
        String backId = id.substring(7);
        System.out.printf("%s%s",frontId,backId);
        // 0이상 6미만, 7이상
    }

}
