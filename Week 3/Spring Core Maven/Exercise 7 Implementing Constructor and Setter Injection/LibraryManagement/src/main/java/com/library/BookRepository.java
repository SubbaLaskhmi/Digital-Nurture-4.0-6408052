package com.library;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<Book> getBooks() {
        return Arrays.asList(
            new Book("Java Basics"),
            new Book("Spring in Action")
        );
    }
}
