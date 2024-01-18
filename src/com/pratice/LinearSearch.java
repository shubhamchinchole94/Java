package com.pratice;

public class LinearSearch {
    public static void main(String[] args) {

        int nums[] = {2,5,9,7,8,11};
        int target = 8;


      int result = linearSearch(nums,target);

            if(result != -1){

            System.out.println("Element found at Index: " +result);
        }else {
                System.out.println("Element not found");
            }


    }

    public static int linearSearch(int[] nums, int target) {

        for (int i=0;i<=nums.length;i++){

            if(nums[i] == target){

                return i;
            }
        }


        return -1;
    }
}
