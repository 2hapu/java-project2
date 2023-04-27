package com.example.javaproject.week2.day3;

public class StringAccu {
    public static void main(String[] args) {
        String answer = "";

        answer += "쿵";
        System.out.println(answer);

        answer += "짝";
        System.out.println(answer);

        answer += "쿵짝";
        System.out.println(answer);

        answer += "쿵짜작쿵짝";
        System.out.println(answer);

        char[] str = new char[5]; // 불변 객체
        char[] str2 = new char[6]; // 이런 식으로 되어 있어서..? 고쳐지는 것이 아니라 새로 만들어지는 거라 누적 빼기가 안됨 찾아보자
    }
}
