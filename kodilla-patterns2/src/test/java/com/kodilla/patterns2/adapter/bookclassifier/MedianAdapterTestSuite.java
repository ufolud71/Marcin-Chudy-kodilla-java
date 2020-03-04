package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter theAdapter = new MedianAdapter();
        Book b1 = new Book("author1", "title1", 1999, "signature1");
        Book b2 = new Book("author2", "title2", 2000, "signature2");
        Book b3 = new Book("author3", "title3", 2015, "signature3");
        Book b4 = new Book("author4", "title4", 2007, "signature4");
        Book b5 = new Book("author5", "title5", 1859, "signature5");
        Book b6 = new Book("author6", "title6", 1900, "signature6");
        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        //When
        int result = theAdapter.publicationYearMedian(books);
        //Then
        assertEquals(result, 1999);
    }
}
