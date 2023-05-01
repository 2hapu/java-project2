package com.example.javaproject.week3.day1;

public class ProgrammersNumberConcatenator {
    public static void main(String[] args) {
        int[] num_list = new int[]{3, 4, 5, 2, 1};
        int answer = 0;
        String even = new String();
        String odd = new String();
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        System.out.printf("홀수 : %s 짝수 : %s\n", odd, even);
        System.out.println(answer);

    }

}
