package com.library.repository;

import java.util.Arrays;
import java.util.List;
import com.library.model.Book;

public class BookRepository {
    public List<Book> getAllBooks() {
        return Arrays.asList(
            new Book("Java Basics", "James Gosling"),
            new Book("Spring in Action", "Craig Walls")
        );
    }
}
