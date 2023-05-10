package com.example.javaproject.week4.day3;

public class DrawDiamond2 {
    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }

    public static String getRepeatedSymbolFor(String symbol, int n){
        String answer = " ";
        for (int i = 0; i < n; i++) {
            answer += symbol;
        }
        return answer;
    }

    public static String makeALine(int h, int i){
        int pivot = h / 2;
            if (i <= pivot){
                return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    public static void main(String[] args) {
        int h = 9;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
}
