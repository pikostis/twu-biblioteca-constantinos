package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookRentService;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Set;

public class ReturnMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Return Book";
    }

    @Override
    public void execute(BookRentService bookRentService) {
        InputStream inputStream = System.in;
        String bookTitle = getBookTitleFromUser(inputStream);
        Set<Book> unAvailableBooks = bookRentService.getUnAvailableBooks();
        searchUnavailableBooks(bookRentService, bookTitle, unAvailableBooks);
    }

    private void searchUnavailableBooks(BookRentService bookRentService, String bookTitle, Set<Book> unAvailableBooks) {
        boolean bookFound = false;

        Book bookToReturn = null;

        for (Book book : unAvailableBooks) {
           if (book.getBookTitle().equals(bookTitle)) {
               bookToReturn = book;
               bookFound = true;
               System.out.println("Thank you for returning the book.");
               break;
           }
        }

        if (!bookFound) {
            System.out.println("That is not a valid book to return.");
        } else {
            bookRentService.addAvailableBook(bookToReturn);
            bookRentService.removeUnAvailableBook(bookToReturn);
        }
    }

    private String getBookTitleFromUser(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextLine();
    }
}
