package com.example.javaproject.programmers;

import java.util.Arrays;

public class Programmers181923 {
    public static void main(String[] args) {
        // s <= i<= e<= 인 i에 대해 k보다 크면서 가장 작은 arr[i]
        // arr[i]를 찾는거임 k보단 크면서 가장 작은 arr[i]
        // queries[i][0] 보다 크거나 같고 [i][1]보다 작거나 같으며, [i][2] 보다 큰 arr[x]중에 가장 작은 ..

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] answer = new int[queries.length];

//        for (int i = 0; i < queries.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j] >= queries[i][0] && arr[j] <= queries[i][1] && arr[j] > queries[i][2]){
//                    answer[i] = arr[j];
//                } else {
//                    answer[i] = -1;
//                }
//            }
//        }
        // i가 queries[x][2] 보다 크고 [x][0]보다 크거나 같고, [x][1]보다 작은거네 ..
        System.out.println(Arrays.toString(answer));
    }
}
