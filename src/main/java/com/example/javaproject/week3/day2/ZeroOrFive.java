package com.example.javaproject.week3.day2;

public class ZeroOrFive {
    public  static boolean isZeroOrFive(int num){
        while (num > 0) {
            int remainder = num % 10;
            // 5로 나누었을 때 0이 아닌 값들을 return 해줌
            if(remainder % 5 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 555;

        System.out.printf("%d는 5와 0으로만 구성되었나요? %b\n", num, isZeroOrFive(num));
    }
}
