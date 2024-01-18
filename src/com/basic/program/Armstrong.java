package com.basic.program;

public class Armstrong {

    public static void main(String[] args) {



        int number=371,originalNo,rem,result=0;


        originalNo = number;

        while(originalNo != 0){

            rem = originalNo % 10;

            result +=  (Math.pow(rem,3));

            originalNo =originalNo/10;
        }

        if (result == number){
            System.out.println(number + " is an Armstrong Number ");
        }else {
            System.out.println(number + " is not an Armstrong Number ");

        }
    }
}
