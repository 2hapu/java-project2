package com.example.javaproject.week6.day5.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(4);
        int value = intBox.getItem();

        Box<String> stringBox = new Box<>();
        stringBox.setItem("바보");

        List<String> stringList= new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
    }

    public static <T> T getFirstItem(List<T> list){
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
