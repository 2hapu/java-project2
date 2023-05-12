package com.example.javaproject.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("Hello");
        li.add(1);

        System.out.println(li.get(0)); // Hello
        System.out.println(li.get(1)); // 1
        System.out.println(li.size()); // 2
        System.out.println(li.isEmpty()); // false
        li.remove(0);
        li.remove(0);
        // -> ArrayList는 요소 삭제시에 다음 인덱스의 요소를 이동시켜 자리를 채움
        System.out.println(li.isEmpty()); // true

    }
}
