package com.example.javaproject.week4.day1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StairsStars {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int height = 4;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                bw.append(" ");
            }
            bw.append("**\n");
        }
        bw.flush();
        bw.close();
    }
}
