package com.example.javaproject.week4.day4;

import java.io.*;
import java.io.FileReader;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        // BufferedReader 파라미터 값이 뭐가 들어가는건지에 차이 얘는 콘솔에서 읽어오기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\leedy\\Desktop\\parser\\1.병원정보서비스 2022.10..csv"));
        System.out.println(br.readLine());
    }
}
