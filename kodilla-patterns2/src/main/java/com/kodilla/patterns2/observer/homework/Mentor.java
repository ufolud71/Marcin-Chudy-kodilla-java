package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void updateQueue(UserHomework userHomework) {
        System.out.println(name + ": New homework from: " + userHomework.getName() + "\n" + " (total: " + userHomework.getHomeworkQueue().size() + " homework in queue");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
