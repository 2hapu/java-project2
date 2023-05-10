package com.example.javaproject.week4.day3;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }

    public static String makeALine(int h, int i){
        int pibot = h / 2;
        if (i <= pibot){
            return String.format("%s%s\n", getRepeatedSymbol(" ", pibot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pibot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }
    public static void main(String[] args) {
        int h = 9;
        int pibot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pibot){
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", pibot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", i - pibot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
