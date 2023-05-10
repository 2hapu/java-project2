package com.example.javaproject.week4.day3;

import java.io.IOException;

public class HelloPrinter2 {

    Printer3 printer3;

    public HelloPrinter2(Printer3 printer3) {
        this.printer3 = printer3;
    }

    public void repeatPrint(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer3.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter2 hp2 = new HelloPrinter2(new FilePrinter2());
        hp2.repeatPrint(5, "Bye");
    }
}
