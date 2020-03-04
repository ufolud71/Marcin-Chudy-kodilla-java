package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        List<Book> booksList = new ArrayList<>();
        booksList.addAll(bookSet);
        List<Integer> yearsOfPublicationList = booksList.stream()
                .map(o -> o.getYearOfPublication())
                .collect(Collectors.toList());

        Collections.sort(yearsOfPublicationList);
        int median;
        int mid;

        if(yearsOfPublicationList.size() % 2 != 0) {
            mid = (yearsOfPublicationList.size() / 2);
            median = yearsOfPublicationList.get(mid);
        } else {
            mid = yearsOfPublicationList.size() / 2;
            int add = yearsOfPublicationList.get(mid - 1) + yearsOfPublicationList.get(mid);
            median = add / 2;
        }
        return median;
    }
}
