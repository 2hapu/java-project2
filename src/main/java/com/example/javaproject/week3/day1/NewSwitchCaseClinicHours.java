package com.example.javaproject.week3.day1;

public class NewSwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "월";
        String time = switch (day){
            case "월", "화", "목", "금" -> time = "08:30 - 18:00";
            case "수", "토" -> time = "08:30 - 14:00";
            case "일" -> "휴진";
            default -> throw new IllegalArgumentException("해당하는 일이 없습니다. 입력 일 : " + day);
        };
        System.out.printf("%s요일은 %s입니다.\n", day,time);
    }
}
