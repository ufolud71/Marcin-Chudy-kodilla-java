package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.Observer;

import java.util.ArrayList;
import java.util.List;

public class UserHomework implements Observable {
    private final List<Observer> mentors;
    private final List<String> homeworkQueue;
    String name;

    public UserHomework(String name) {
        mentors = new ArrayList<>();
        homeworkQueue = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String task) {
        homeworkQueue.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyMentors() {
        for(Observer observer : mentors) {
            observer.updateQueue(this);
        }
    }

    @Override
    public void removeMentor(Observer observer) {
        mentors.remove(observer);
    }

    public List<Observer> getMentors() {
        return mentors;
    }

    public List<String> getHomeworkQueue() {
        return homeworkQueue;
    }

    public String getName() {
        return name;
    }
}
