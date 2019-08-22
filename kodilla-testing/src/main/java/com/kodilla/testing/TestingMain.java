package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(10,5);

        int result1 = calculator.add();

        int result2 = calculator.substract();

        if(result1 == 15) {
            System.out.println("Adding method works!");
        } else {
            System.out.println("Adding method doesn,t work :(");
        }

        if (result2 == 5) {
            System.out.println("Substracting method works!");
        } else {
            System.out.println("Substracting method doesn,t work :(");
        }

    }
}
