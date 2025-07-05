package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class BookSearch {
	
	public static void main(String[] args) {
        Book[] books = {new Book("B001", "The Alchemist", "Paulo Coelho"),
            new Book("B002", "Atomic Habits", "James Clear"),
            new Book("B003", "Clean Code", "Robert C. Martin"),
            new Book("B004", "1984", "George Orwell"),
            new Book("B005", "Sapiens", "Yuval Noah Harari")};
        BookSearch search = new BookSearch();
        String searchTitle1 = "Clean Code";
        System.out.println("Linear Search Result for '" + searchTitle1 + "':");
        Book result1 = search.linearSearch(books, searchTitle1);
        System.out.println(result1 != null ? result1 : "Book not found.");
        String searchTitle2 = "Sapiens";
        System.out.println("\nBinary Search Result for '" + searchTitle2 + "':");
        Book result2 = search.binarySearch(books, searchTitle2);
        System.out.println(result2 != null ? result2 : "Book not found.");
    }

    public Book linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
    
    public Book binarySearch(Book[] books, String title) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
     int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
