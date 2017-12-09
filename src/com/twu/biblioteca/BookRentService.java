package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class BookRentService {

    private Set<Book> allBooks;
    private Set<Book> availableBooks = new HashSet<Book>();
    private Set<Book> unAvailableBooks = new HashSet<Book>();


    public boolean isBookAvailable(Book book) {
        return this.availableBooks.contains(book);
    }

    public void addAvailableBook(Book book) {
        this.availableBooks.add(book);
    }

    public void listAvailableBooks() {
        System.out.println("Book Title\t\t|\tAuthor\t\t|\tRelease Date");
        System.out.println("----------\t\t|\t------\t\t|\t------------");

        for (Book book : availableBooks) {
            System.out.println(book);
        }
    }

    public boolean checkout(Book book) {
        if (book == null) return false;
        if (availableBooks.contains(book)) {
            unAvailableBooks.add(book);
            availableBooks.remove(book);
            System.out.println("Thank you! Enjoy the book");
            return true;
        } else {
            System.out.println("That book is not available.");
            return false;
        }
    }

    public boolean returnBook(Book book) {
        if (availableBooks.contains(book) || book == null) {
            System.out.println("That is not a valid book to return.");
            return false;
        } else {
            availableBooks.add(book);
            unAvailableBooks.remove(book);
            System.out.println("Thank you for returning the book.");
            return true;
        }
    }
}
