package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> number;


    public void OddNumbersExterminator() {

    }

    public void exterminate(ArrayList <Integer> number) {

        ArrayList<Integer> even = new ArrayList<Integer>();
        for(Integer n: number ) {
            if(n % 2 == 0) {
                even.add(n);
            }
        }
    }
    public static void main (String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();

        
        OddNumbersExterminator e = new OddNumbersExterminator();
        e.exterminate(number);

    }

}


