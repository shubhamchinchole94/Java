package com.pratice;

import java.util.Scanner;

public class PalindromeWord {


    public static void main(String[] args) {




        String original, reverse ="";


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        original= sc.nextLine();

        int lenght =original.length();

        for (int i=lenght-1;i>=0;i--){

            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }


    }

}
