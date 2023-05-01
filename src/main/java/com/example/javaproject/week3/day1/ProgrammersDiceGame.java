package com.example.javaproject.week3.day1;

public class ProgrammersDiceGame {
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
