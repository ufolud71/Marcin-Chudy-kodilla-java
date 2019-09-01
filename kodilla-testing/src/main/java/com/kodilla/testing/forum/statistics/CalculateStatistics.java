package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class CalculateStatistics {

    ArrayList<String> userNames = new ArrayList<String>();
    int postsCount = 0;
    int commentsCount = 0;
    double avPostPerUser = postsCount/userNames.size();
    double avCommentsPerUser = commentsCount/userNames.size();
    double avCommentsPerPost = commentsCount/postsCount;


    public void calculateAdvStatistics(Statistics statistics){


    }

    public ArrayList<String> getUserNames(){
        return userNames;
    }

    public int getPostsCount(){
        return postsCount;
    }

    public int getCommentsCount(){
        return commentsCount;
    }

    public double getAvPostPerUser(){
        return avPostPerUser;
    }

    public double getAvCommentsPerUser(){
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost(){
        return avCommentsPerPost;
    }


}
