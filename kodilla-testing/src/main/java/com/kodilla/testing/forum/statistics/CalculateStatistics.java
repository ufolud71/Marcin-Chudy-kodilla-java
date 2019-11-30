package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics implements Statistics {

    ArrayList<String> userNames = new ArrayList<String>();
    double postsCount;
    double commentsCount;
    double avPostPerUser;
    double avCommentsPerUser;
    double avCommentsPerPost;
    Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        avPostPerUser = statistics.gePostsCount() / statistics.getUsersNames().size();
        avCommentsPerUser = statistics.getCommentsCount() / statistics.getUsersNames().size();
        avCommentsPerPost = statistics.getCommentsCount() / statistics.gePostsCount();
    }

    @Override
    public ArrayList<String> getUsersNames() {
        return userNames;
    }

    @Override
    public double getCommentsCount() {
        return commentsCount;
    }

    @Override
    public double gePostsCount() {
        return postsCount;
    }
}



