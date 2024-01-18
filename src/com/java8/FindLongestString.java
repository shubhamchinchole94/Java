package com.java8;

import java.util.Arrays;

public class FindLongestString {

    public static void main(String[] args) {


        String[] strArray ={"java","docker","springboot","mySQL","amazonewebservices"};


        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

    }
}
