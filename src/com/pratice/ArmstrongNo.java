package com.pratice;

public class ArmstrongNo {

    public static void main(String[] args) {


        int number = 153,temp,rem,result=0;

        temp = number;


        while (temp != 0){

            rem = temp % 10;

            result += Math.pow(rem,3);

            temp = temp / 10;


        }

        if (result == number){

            System.out.println(number + "  is an Armstrong number");
        }else {
            System.out.println(number + "  is not an Armstrong number");

        }



    }
}
