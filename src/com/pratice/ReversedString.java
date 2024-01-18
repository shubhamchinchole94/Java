package com.pratice;

public class ReversedString {

    public static void main(String[] args) {

        String str = "Dream big", revStr = "";

        for (int i = str.length()-1;i>=0;i--){

            revStr = revStr + str.charAt(i);

        }

        System.out.println("The reversed of given string is: " +revStr);
    }
}
