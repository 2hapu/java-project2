package com.example.javaproject.week5.day4;

public class BracketWithoutStack {
    public static void main(String[] args) {
        // 반복문을 돌려서 ()가 없을 때까지 ..
        // indexOf() 메서드는 찾는 문자열이 존재하는 경우 해당 문자열의 시작 인덱스를 반환하고, 찾는 문자열이 존재하지 않는 경우 -1을 반환합니다.
        String brackets = "((((()))))";

        while (brackets.indexOf("()") != -1){
            brackets = brackets.replace("()", "");
        }
        if(brackets.length() == 0){
            System.out.println("올바른 괄호입니다.");
        } else {
            System.out.println("올바른 괄호가 아닙니다");
        }
        System.out.println(brackets);

    }
}
