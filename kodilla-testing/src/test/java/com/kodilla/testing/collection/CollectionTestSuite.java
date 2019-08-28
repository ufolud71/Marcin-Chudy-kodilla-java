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
        int result = even.size();
        //Then
        Assert.assertEquals(0, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        number.add(6);
        number.add(22);
        number.add(9);
        number.add(14);
        //When
        exterminator.exterminate(number);
        int result = even.size();
        //Then
        Assert.assertEquals(3, result);

    }

}
