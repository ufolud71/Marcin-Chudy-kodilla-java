package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import java.util.ArrayList;
import com.kodilla.testing.shape.ShapeCollector;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private Object Triangle;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector c = new ShapeCollector();
        Triangle triangle = new Triangle();
        //When
        c.addFigure(triangle);
        //Then
        Assert.assertEquals(1, c.getShapesQuantity());

    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector c = new ShapeCollector();
        Triangle triangle = new Triangle();
        //When
        boolean result = c.removeFigure(triangle);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector c = new ShapeCollector();
        Triangle triangle = new Triangle();
        //When
        boolean result = c.getFigure(1);
        //Then
        Assert.assertFalse(result);
    }



}
