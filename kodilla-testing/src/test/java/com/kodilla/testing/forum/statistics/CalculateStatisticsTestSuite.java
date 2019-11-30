package com.kodilla.testing.forum.statistics;

import org.junit.*;
import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    private static int testCounter = 0;

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
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Thomas");
        userNames.add("John");
        userNames.add("Dave");
        userNames.add("Jordan");
        int postsCount = 0;
        int commentsCount = 10;
        when(statisticsMock.getUsersNames()).thenReturn(userNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);





    }

}
