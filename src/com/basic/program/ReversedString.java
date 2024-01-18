package com.basic.program;

public class ReversedString {

    public static void main(String[] args) {

        String str = "Dream big",reversedStr= "";

        for (int i= str.length()-1; i>=0; i--){

            reversedStr = reversedStr +str.charAt(i);
        }

        System.out.println("The reverse of given string is :  " +reversedStr);
    }
}
