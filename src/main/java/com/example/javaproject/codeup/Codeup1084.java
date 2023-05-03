package com.example.javaproject.codeup;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int sum = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                    String line ="";
                for (int k = 0; k < blue; k++) {
                    line += i + " " + j + " " + k + "\n";
                    sum++;
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(sum);
    }
}
