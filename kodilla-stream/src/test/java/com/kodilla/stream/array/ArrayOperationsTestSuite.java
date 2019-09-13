package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[] {0, 1, 2, 3, 4, 5};
        //When
        double result = ArrayOperations.getAverage(numbers).getAsDouble();
        //Then
        Assert.assertEquals(2.5, result, 0.1);
    }
}
