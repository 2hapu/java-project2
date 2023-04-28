package com.example.javaproject.week2.day5;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연차와 프로젝트 횟수를 입력하세요 : ");
        int yearsOfExp = sc.nextInt();
        int projectCount = sc.nextInt();

        if(yearsOfExp > 5 || projectCount > 10){
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
