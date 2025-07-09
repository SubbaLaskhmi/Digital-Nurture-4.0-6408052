package com.library;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // Constructor for constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor Injection: " + serviceName);
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository injected");
    }

    public void printBookList() {
        List<Book> books = bookRepository.getBooks();
        System.out.println(serviceName + " - Book List:");
        for (Book book : books) {
            System.out.println(" - " + book.getTitle());
        }
    }
}
