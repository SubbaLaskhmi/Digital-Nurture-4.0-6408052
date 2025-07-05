package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    private List<String> books = Arrays.asList(
            "📖 The Alchemist by Paulo Coelho",
            "📘 Clean Code by Robert C. Martin",
            "📙 Effective Java by Joshua Bloch",
            "📕 Introduction to Algorithms by Cormen et al."
    );

    public void printAllBooks() {
        System.out.println("Displaying all books in the repository:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
