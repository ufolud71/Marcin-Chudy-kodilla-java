package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public interface Statistics {
    ArrayList<String> getUsersNames(); // list of users names
    double getCommentsCount();       // total quantity of forum comments
    double gePostsCount();
}