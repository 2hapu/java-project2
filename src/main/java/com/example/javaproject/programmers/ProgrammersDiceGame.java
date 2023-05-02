package com.example.javaproject.programmers;

public class ProgrammersDiceGame {
    //https://school.programmers.co.kr/learn/courses/30/lessons/181930
    class Solution {
        public int solution(int a, int b, int c) {
            int answer = 0;
            if(a != b && b != c){
                answer = a+b+c;
            }
            if(a == b || b == c){
                answer = (a + b + c) * ((a*a) + (b*b) + (c*c));
            }
            if(a == b && b == c){
                answer = (a + b + c) * ((a*a) + (b*b) + (c*c)) * ((a*a*a) + (b*b*b) + (c*c*c));
            }
            return answer;
        }
    }
}
