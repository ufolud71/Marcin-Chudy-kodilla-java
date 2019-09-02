package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;



public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text", n -> "ABC" + n + "ABC");
        poemBeautifier.beautify("Cancer", n -> n.toUpperCase());
        poemBeautifier.beautify("POEM", n -> n.toLowerCase());
        poemBeautifier.beautify("Beautiful", n -> "~" + n + "~");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}