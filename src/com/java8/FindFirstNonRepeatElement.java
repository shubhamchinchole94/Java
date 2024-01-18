package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatElement {
    public static void main(String[] args) {

        String input = "ilovejavaprogramming";


        String firstNonRepeatElement = Arrays.stream(input.split(""))


                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();

        System.out.println("1st Non repeat element : " +firstNonRepeatElement);

    }
}
