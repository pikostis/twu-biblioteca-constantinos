package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class BookRentService {

    private Set<Book> availableBooks = new HashSet<Book>();
    private Set<Book> unAvailableBooks = new HashSet<Book>();

    public Set<Book> getAvailableBooks() {
        return availableBooks;
    }

    public Set<Book> getUnAvailableBooks() {
        return unAvailableBooks;
    }

    public boolean isBookAvailable(Book book) {
        return this.availableBooks.contains(book);
    }

    public void addAvailableBook(Book book) {
        this.availableBooks.add(book);
    }

    public void listAvailableBooks() {
        printLine();
        System.out.println("Book Title");
        printLine();

        for (Book book : availableBooks) {
            System.out.println(book.getBookTitle());
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

        for (Book book : availableBooks) {
            System.out.printf("%-30.30s %-30.30s %-30.30s%n", book.getBookTitle(), "| " + book.getAuthor(), "| " + book.getRealeaseDate());
        }
        printLine();

    }

    public void addUnAvailableBook(Book book) {
        this.unAvailableBooks.add(book);
    }

    public void removeAvailable(Book book) {
        availableBooks.remove(book);
    }

    public void removeUnAvailableBook(Book book) {
        unAvailableBooks.remove(book);
    }

    public boolean searchAvailableBooks(Set<Book> books, String bookTitle) {
        Book bookToSearch = searchForBook(books, bookTitle);
        return searchAvailableBookHelper(bookToSearch);
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

    private boolean searchAvailableBookHelper(Book bookToCheckout) {
        if (bookToCheckout == null) {
            System.out.println("That book is not available.");
            return false;
        } else {
            System.out.println("Thank you! Enjoy the book");
            removeAvailable(bookToCheckout);
            addUnAvailableBook(bookToCheckout);
            return true;
        }
    }

    public boolean searchUnavailableBooks(Set<Book> unAvailableBooks, String bookTitle) {
        Book bookToReturn = searchForBook(unAvailableBooks, bookTitle);
        return searchUnavailableBookHelper(bookToReturn);
    }

    private boolean searchUnavailableBookHelper(Book bookToReturn) {
        if (bookToReturn == null) {
            System.out.println("That is not a valid book to return.");
            return false;
        } else {
            System.out.println("Thank you for returning the book.");
            addAvailableBook(bookToReturn);
            removeUnAvailableBook(bookToReturn);
            return true;
        }
    }
}
