package com.example.javaproject.programmers;

import java.util.Arrays;

public class ArrayQueryProcessor {
    //https://school.programmers.co.kr/learn/courses/30/lessons/181924
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int[][] queries = {{0,3},{1,2},{1,4}};
        int j = 0;
        for(int i = 0; i < queries.length; i++){
            int temp = arr[queries[i][j]];
            arr[queries[i][j]] = arr[queries[i][j+1]];
            arr[queries[i][j+1]] = temp;
        }

        System.out.println(Arrays.toString(arr));



    }
}
