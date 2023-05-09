package com.example.javaproject.week4.day1;

public class MutsaMath {
    // 약수의 합을 리턴하는 메소드
    int sumOfFactors(int num) {
        // num % i == 0이면 약수
        // 12 --> 1, 2, 3, 4, 6, 12 => 28
        int answer = 1;
        for (int i = 2; i <= num; i++) {
            if(num % i == 0){
                answer += i;
            }
        }
        return answer;
    }


    void printMutsa(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다\n.", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();

        mutsaMath.printMutsa(12);
        mutsaMath.printMutsa(35);
        mutsaMath.printMutsa(6);
        mutsaMath.printMutsa(7);
    }
}
