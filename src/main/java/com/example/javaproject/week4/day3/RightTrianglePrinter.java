//package com.example.javaproject.week4.day3;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class RightTrianglePrinter {
//
//
//    private Printer printer;
//
//    public RightTrianglePrinter(Printer printer) {
//        this.printer = printer;
//    }
//
//
//    // sout : console
//    // BufferedWriter : console, file
//    public String makeALine(int h, int i){
//        return String.format("%s%s\n", "", "*".repeat(i));
//    }
//
//    // 출력하기
//    public void printToFile(String[] lines) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.text"));
//
//        for (int i = 0; i < lines.length; i++) {
//            bw.append(lines[i]);
//            bw.flush();
//        }
//        bw.close();
//    }
//
////    // 콘솔에 모양 출력하기
////    public void printToConsole(String[] lines){
////        for (int i = 0; i < lines.length; i++) {
////            System.out.println(lines[i]);
////        }
////    }
//
//    //모양 출력하기
//    public void printShape(int h) throws IOException {
//        // 모양 만들기
//        String[] lines = new String[h];
//        for (int i = 0; i < h; i++) {
//            lines[i] = makeALine(h, i + 1);
//        }
//        //모양 출력하기
//        printer.print(lines);
////        printToFile(lines);
//    }
//    public static void main(String[] args) throws IOException {
//        RightTrianglePrinter rtp = new RightTrianglePrinter();
//        rtp.printShape(5);
//    }
//}
