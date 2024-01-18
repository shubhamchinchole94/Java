package com.basic.program;

public class LargestElement {

    public static void main(String[] args) {

        int arr[] = new int[]{11,2,8,52,88,10};

        int max= arr[0];
        for (int i = 0; i<arr.length; i++){


            if(arr[i]>max){

                max=arr[i];

            }



        }
        System.out.println("Largest element in given array : " +max);

    }
}
