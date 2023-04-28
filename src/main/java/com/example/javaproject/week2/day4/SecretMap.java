package com.example.javaproject.week2.day4;

import java.util.Arrays;
import java.util.Scanner;

public class SecretMap {
    // 한 변의 길이 n 정사각형
    // 공백 0 or # 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        String[] map1 = new String[leng];
        String[] map2 = new String[leng];


        System.out.println(leng);
        System.out.println(Arrays.toString(map1));
        System.out.println(Arrays.toString(map2));
        System.out.println(map2);

    }
}
