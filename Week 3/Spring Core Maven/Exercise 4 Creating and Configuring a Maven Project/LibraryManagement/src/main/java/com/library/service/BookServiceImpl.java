package com.library.service;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void displayBooks() {
        System.out.println("📖 Book List:");
        for (Book book : books) {
            book.display();
        }
    }
}
