package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        // 세로 h
        // 가로 w
        // 막대 개수 n

        // 막대의 길이 l
        // 막대의 방향 d (가로 0, 세로 1)
        // 막대를 놓는 막대의 가장 왼쪽(x)과 위쪽(y)
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int num = sc.nextInt();

        int leng = sc.nextInt();
        int d = sc.nextInt(); // 세로로 1
        int x = sc.nextInt(); // x = 2
        int y = sc.nextInt(); // y = 3
        // d가 1이면 arr[2][3] [3][3], [4][3]
        // d가 0이면 arr[2][3] [2][4], [2][5]
        //
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {

            }
        }
    }
}
