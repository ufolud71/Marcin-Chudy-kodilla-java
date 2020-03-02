package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.Observer;

public interface Observable {
    void registerMentor(Observer observer);
    void notifyMentors();
    void removeMentor(Observer observer);
}
