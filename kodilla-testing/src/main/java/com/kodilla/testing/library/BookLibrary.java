package com.kodilla.testing.library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public ArrayList<Book> listBooksWithCondition(String titleFragment) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        ArrayList<Book> resultList = (ArrayList<Book>) libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public ArrayList<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        ArrayList<Book> bookListInHand = new ArrayList<Book>();
        ArrayList<Book> resultListOfBooks = (ArrayList<Book>) libraryDatabase.listBooksInHandsOf(libraryUser);

        bookListInHand = resultListOfBooks;
        return bookListInHand;
    }
}
