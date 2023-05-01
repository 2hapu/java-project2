package com.example.javaproject.week3.day1;

public class ProgrammersNumberConcatenator2 {
    // int만 사용하는 버전
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] num_list) {
                int answer = 0;
                int odd = 0;
                int even = 0;

                for (int i = 0; i < num_list.length; i++) {
                    if (num_list[i] % 2 == 0) {
                        even *= 10;
                        even += num_list[i];
                    } else {
                        odd *= 10;
                        odd += num_list[i];
                    }
                }
                answer = even + odd;
                return answer;
            }
        }

    }
}