package com.example.javaproject.week3.baby;

public class TypeCasting {
    public static void main(String[] args) {
//      자동 형 변환(암묵적인)
//      작은 타입을 큰 타입으로 변환해줍니다.
        System.out.println(1 + "1"); // 11

//      강제 형 변환(명시적인)
//      데이터 유실이 생길 수 있음
        double dVal = 123.456;
        int iVal = (int)dVal;
        System.out.println(iVal);

        System.out.println(1 + Integer.parseInt("1"));
//      그럼 실수는 어떻게 ?
//        Float.parseFloat("1");
//        Double.parseDouble("1");
//        문자열 1.11111111 , 2.11111111 두 개를 더한 값이 정확히 나오게 출력
//        float : 소수점 이하 7자리까지 정확성 보장
//        double : 소수점 이하 열다섯자리까지 정확성 보자
//        BigDecimal : 열 다섯자리보다 더 긴 실수형 구할 때 사용
        double dVal1 = Double.parseDouble("1.11111111");
        double dVal2 = Double.parseDouble("2.11111111");
        System.out.println(dVal1 + dVal2);
    }
}
