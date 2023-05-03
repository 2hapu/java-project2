package com.example.javaproject.week3.day2;

public class ForLoopCase2 {
    public static void main(String[] args) {

        // Math.sqrt() 루트의 제곱근?
        // 이건 조금 무거워서 i * i <= 50으로 하면 좋음
        for (int i = 0; i <= Math.sqrt(50) ; i++) {
            System.out.println(i);            
        }
    }
}
