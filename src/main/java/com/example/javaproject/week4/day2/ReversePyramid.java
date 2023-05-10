package com.example.javaproject.week4.day2;

public class ReversePyramid {
    private String spaceChar = "0";

    // 생성자 붙이기
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(i), "*".repeat(2 * (h - i) - 1));
    }
    public String makeParallelogram(int h, int i) {
        return String.format("%s%s\n", "0".repeat(i), "*".repeat(2 * (h - i) - 1));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.print(reversePyramid.makeALine(h, i));
        }
    }
}