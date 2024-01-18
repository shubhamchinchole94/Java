package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find2ndLargestElement {

    public static void main(String[] args) {




        int[] numbers ={5,9,11,2,21,1}; //1,2,5,9,11,21

        Integer secondHighestNumber = Arrays.stream(numbers).boxed()

                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println("2nd highest element : " +secondHighestNumber);


        Arrays.stream(numbers).sorted().forEach(System.out::println);

    }
}
