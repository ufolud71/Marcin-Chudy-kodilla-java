package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    ArrayList<Integer> number = new ArrayList<Integer>();


    public ArrayList<Integer> exterminate(ArrayList <Integer> number) {

        ArrayList<Integer> even = new ArrayList<Integer>();
        for(Integer n: number ) {
            if(n % 2 == 0) {
                even.add(n);
            }
        }
        System.out.println(even.size());
        return even;
    }

}


