package com.example.javaproject.programmers;

import java.util.Scanner;

public class Programmers12928 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12928
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}

