package com.example.javaproject.week4.day3;

public class DiamondShapeDrawer2 extends ShapeDrawer2{

    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int h, int i) {
        int pibot = h / 2;
        if (i <= pibot){
            return String.format("%s%s\n", getRepeatedSymbol(" ", pibot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pibot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer2 diamond = new DiamondShapeDrawer2();
        diamond.printShape(5);
    }
}
