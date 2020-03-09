package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {

    double users;
    double posts;
    double comments;
    double avPostPerUser;
    double avCommentsPerUser;
    double avCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.getUsersNames().size();
        posts = statistics.gePostsCount();
        comments = statistics.getCommentsCount();
        if(users!=0) {
            avPostPerUser = posts / users;
            avCommentsPerUser = comments / users;
        }
        else {
            avPostPerUser = 0;
            avCommentsPerUser = 0;
        }
        if(posts!=0)
            avCommentsPerPost = comments / posts;
        else
            avCommentsPerPost = 0;
    }
}








