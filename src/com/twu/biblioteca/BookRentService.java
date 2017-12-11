package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class BookRentService {

    private Set<Book> books = new HashSet<Book>();

    public void listAvailableBooks() {
        printLine();
        System.out.println("Book Title");
        printLine();

        for (Book book : books) {
            if (book.isBookAvailableForCheckout()) {
                System.out.println(book.getBookTitle());
            }
        }
        printLine();

    }

    private void printLine() {
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    public void listAvailableBooksWithDetails() {
        printLine();
        System.out.printf("%-30.30s %-30.30s %-30.30s%n", "Book Title","| Author", "| Release Date");
        printLine();

        for (Book book : books) {
            if (book.isBookAvailableForCheckout()) {
                System.out.printf("%-30.30s %-30.30s %-30.30s%n", book.getBookTitle(), "| " + book.getAuthor(), "| " + book.getRealeaseDate());
            }
        }
        printLine();

    }

    private Book searchForBook(Set<Book> books, String bookTitle) {
        Book bookToSearch;

        for (Book book : books) {
            if (book.getBookTitle().equals(bookTitle)) {
                bookToSearch = book;
                return bookToSearch;
            }
        }
        return null;
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    public Set<Book> getBooks() {
        return books;
    }

    public boolean checkoutBook(Set<Book> books, String bookTitle) {
        Book bookToCheckout = searchForBook(books, bookTitle);
        if (bookToCheckout == null) {
            System.out.println("That book is not available.");
            return false;
        }

        if (bookToCheckout.isBookAvailableForCheckout()) {
            System.out.println("Thank you! Enjoy the book");
            bookToCheckout.setBookAvailableForCheckout(false);
            return true;
        } else {
            System.out.println("That book is not available.");
            return false;
        }
    }

    public boolean returnBook(Set<Book> books, String bookTitle) {
        Book bookToReturn = searchForBook(books, bookTitle);
        if (bookToReturn == null) {
            System.out.println("That is not a valid book to return.");
            return false;
        }
        boolean isBookAvailableForReturn = !bookToReturn.isBookAvailableForCheckout();
        if (isBookAvailableForReturn) {
            System.out.println("Thank you for returning the book.");
            bookToReturn.setBookAvailableForCheckout(true);
            return true;
        } else {
            System.out.println("That is not a valid book to return.");
            return false;
        }
    }
}
