package com.example.javaproject.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");
        // 메모리 주소끼리 비교하기 때문에 같음

        // 1과 2는 같을까?
        String str1 = "GOLD";
        String str2 = "G";
        boolean isSame = str1.substring(0,1) == str2;

        System.out.println(isSame);

        // str1 의 G와 str2 의 G 의 해시코드
        System.out.println("str1.substring(0, 1) 의 해시코드 = " + str1.substring(0, 1).hashCode());
        System.out.println("str2 의 해시코드 = " + str2.hashCode());
    }
}
