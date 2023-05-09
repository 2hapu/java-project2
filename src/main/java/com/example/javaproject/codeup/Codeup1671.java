package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1671 {
    // win, tie, lose
    public String Play(int user, int computer) {
        if(user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }


    }
    public static void main(String[] args) {
        Codeup1671 rps = new Codeup1671();
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();

        System.out.println(rps.Play(user, computer));
    }
}
