package com.pratice;

public class Palindrome {

    public static void main(String[] args) {


        int number = 121,temp;
        int result,sum=0;


        temp =number;

        while (number>0){


            result = number%10;
            sum = (sum*10) + result;
            number = number / 10;
        }

        if (temp == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
