package com.example.javaproject.week4.day1;

import java.util.Scanner;

public class RockPaperScissors {
    // win, tie, lose
    public String Play(int user, int computer) {
        if(user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }


    }
    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();

        System.out.println(rps.Play(user, computer));
    }
}
