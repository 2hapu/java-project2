package com.example.javaproject.week6.day5.exception;

public class Main {
    public static void main(String[] args) {

        try{
            throw new Exception();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            throw new RuntimeException();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
