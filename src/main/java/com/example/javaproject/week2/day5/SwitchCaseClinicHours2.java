package com.example.javaproject.week2.day5;

import java.util.Scanner;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day =sc.nextLine();
        String time = "휴진";
        switch (day){
            case "월", "화", "목", "금": time = "08:30 - 18:00"; break;
            case "수", "토": time = "08:30 - 14:00"; break;
            case "일": break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
