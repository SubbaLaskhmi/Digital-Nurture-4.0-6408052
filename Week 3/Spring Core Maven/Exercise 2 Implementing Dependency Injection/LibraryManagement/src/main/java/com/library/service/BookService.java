package com.library.service;

import com.library.repository.BookRepository;
import com.library.model.Book;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBooks() {
        List<Book> books = bookRepository.getAllBooks();
        books.forEach(System.out::println);
    }
}
