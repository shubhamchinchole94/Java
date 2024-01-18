package com.pratice;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestArray {


    public static void main(String[] args) {

        Integer arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);

    }

    private static void print2largest(Integer[] arr, int arr_size) {

        Arrays.sort(arr, Collections.reverseOrder());

        for (int n:arr){
            System.out.print(n +" ");
        }



        for (int i=1; i<arr_size;i++){


            if(arr[i] != arr[0]){
                System.out.println("Second largest element :" +arr[i]);

                return;
            }

        }

        System.out.println("No element found");
    }
}
