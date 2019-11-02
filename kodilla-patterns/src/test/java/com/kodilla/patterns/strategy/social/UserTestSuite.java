package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Pupcini");
        User user2 = new YGeneration("EdytaJ");
        User user3 = new ZGeneration("TommyTrain");

        //When
        String user1Publisher = user1.sharePost();
        System.out.println("Pupcini: " + user1Publisher);
        String user2Publisher = user2.sharePost();
        System.out.println("EdytaJ: " + user2Publisher);
        String user3Publisher = user3.sharePost();
        System.out.println("TommyTrain: " + user3Publisher);

        //Then
        Assert.assertEquals("Sharing tweet on Tweeter", user1Publisher);
        Assert.assertEquals("Sharing post on Facebook", user2Publisher);
        Assert.assertEquals("Sending Snapchat", user3Publisher);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User user1 = new Millenials("Lucian");

        //When
        String user1Publisher = user1.sharePost();
        System.out.println("Lucian: " + user1Publisher);
        user1.setSocialPublisher(new FacebookPublisher());
        user1Publisher = user1.sharePost();
        System.out.println("Lucian is now: " + user1Publisher);

        //Then
        Assert.assertEquals("Sharing post on Facebook", user1Publisher);
    }
}