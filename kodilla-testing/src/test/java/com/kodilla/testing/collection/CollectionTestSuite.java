package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        //When
        exterminator.exterminate(number);
        //Then
        System.out.println(number.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        number.add(5);
        number.add(22);
        number.add(9);
        number.add(14);
        //When
        exterminator.exterminate(number);
        //Then
        for(Integer n: even) {
            System.out.println(n);
        }

    }

}
