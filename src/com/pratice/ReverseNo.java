package com.pratice;

public class ReverseNo {

    public static void main(String[] args) {


        int number = 987654, reverse = 0;


        while ( number!= 0){

            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;

        }
        System.out.println("The reversed of given number is : " +reverse);
    }
}
