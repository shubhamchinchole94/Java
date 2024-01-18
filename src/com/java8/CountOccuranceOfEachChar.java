package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfEachChar {

    public static void main(String[] args) {

        String input = "ilovejavaprogramming";
      // String[] results= input.split("");
        //System.out.println(Arrays.toString(results));

        Map<String, Long>  map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

    }

}
