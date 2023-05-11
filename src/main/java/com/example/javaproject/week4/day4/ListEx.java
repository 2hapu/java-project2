package com.example.javaproject.week4.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        System.out.println(l1.get(0));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty()); // false
        System.out.println(l1.remove(0));
        System.out.println(l1.isEmpty()); // true

    }

}
