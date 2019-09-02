package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<ForumUser>();

    public Forum() {
        userList.add(new ForumUser(1, "Pasha", 'M', LocalDate.of(1999,8,6),3));
        userList.add(new ForumUser(2, "Aśka", 'F', LocalDate.of(2001,8,22),10));
        userList.add(new ForumUser(3, "Chłop", 'M', LocalDate.of(1989,3,21),5));
        userList.add(new ForumUser(4, "MinecraftKid", 'M', LocalDate.of(2005,1,13),49));
        userList.add(new ForumUser(5, "PISior", 'M', LocalDate.of(1933,7,30),0));
        userList.add(new ForumUser(6, "Galio", 'M', LocalDate.of(1977,10,17),0));
        userList.add(new ForumUser(7, "Grażka", 'F', LocalDate.of(1940,12,6),15));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }


}
