package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import static java.time.LocalDate.now;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book b1 = new Book("Book1", "Author1", now());
        Book b2 = new Book("Book2", "Author2", now());
        Book b3 = new Book("Book3", "Author3", now());
        Book b4 = new Book("Book4", "Author4", now());

        library.getBooks().add(b1);
        library.getBooks().add(b2);
        library.getBooks().add(b3);
        library.getBooks().add(b4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName ("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(b3);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
