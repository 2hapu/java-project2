package com.example.javaproject.week5.day2;

import java.util.Arrays;

public class InsertionSort02 {
    // desc --> 내림차순
    // asc --> 오름차순
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? arr[j] - arr[j - 1] : arr[j - 1] - arr[j]) > 0){
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
            return arr;
        }

    public int[] sort(int[] arr){
      return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {11, 5, 7, 14, 30, 19};
        InsertionSort02 ise = new InsertionSort02();

        arr = ise.sort(arr); // 오름차순
        System.out.println(Arrays.toString(arr));

        arr = ise.sort(arr, false); // 내림차순
        System.out.println(Arrays.toString(arr));
    }

}
