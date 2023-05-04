package com.example.javaproject.week3.baby;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Remind {
    public static void main(String[] args) {
//        int number; // 변수 선언
//        number = 3; // 할당
        int number = 3; //변수 선언 및 초기화
//        데이터 타입(자료형)
//        기본 타입(byte, short, long..)
//        참조 타입 : 기본 타입(String) : 값이 아닌 주소 값을 넣어줌 기본타입과의 차이점

        String str = "a"; // a라는 값을 넣는 것이 아닌 주소 값을 넣어주는 것 ..
        String str2 = "a";
        System.out.println(str == str2);
//        참조 타입이면 heap 영역에 올라감

        Scanner sc = new Scanner(System.in);
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 이 세 가지의 자료를 찾아서 정리 해보면 좋을 것 같음

//      Scanner VS BufferedReader

//      우리가 지금까지 썼던 건 main이나 .. 다른 method 안에서 변수를 썼음 -> 지역변수
//      자바는 객체 지향 언어 ..
//        객체는 Class로 만듦
    }
}
