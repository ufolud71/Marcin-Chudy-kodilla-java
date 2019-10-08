package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String finalList = movieStore.getMovies().entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
                .collect(Collectors.joining("!"));

        System.out.println(finalList);

    }
}
