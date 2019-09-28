package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge start = new SecondChallenge();

        try {

            start.probablyIWillThrowException(2,1);

        } catch(Exception e) {

            System.out.println("Change x or y !");

        } finally {

            System.out.println("I'm gonna be here anyways");

        }

    }
}
