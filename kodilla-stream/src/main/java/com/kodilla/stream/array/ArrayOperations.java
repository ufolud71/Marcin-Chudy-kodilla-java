package com.kodilla.stream.array;

import java.util.stream.IntStream;
import java.util.*;


public interface ArrayOperations {

    public static OptionalDouble getAverage(int[] numbers){
         IntStream stream = IntStream.range(0, numbers.length);
         stream.forEach(n -> System.out.println(n));

         return IntStream.range(0, numbers.length)
                 .average();
    }
}
