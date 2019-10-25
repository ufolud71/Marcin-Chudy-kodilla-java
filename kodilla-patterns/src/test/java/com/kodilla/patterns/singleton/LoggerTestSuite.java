package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openSettingsFile() {
        Logger.getInstance().log("Saving to file");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLogName = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Saving to file", lastLogName);
    }
}
