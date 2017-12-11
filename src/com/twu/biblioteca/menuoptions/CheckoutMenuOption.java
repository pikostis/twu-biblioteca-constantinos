package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookRentService;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Set;

public class CheckoutMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Checkout Book";
    }

    @Override
    public void execute(BookRentService bookRentService) {
        InputStream inputStream = System.in;
        String bookTitle = getBookTitleFromUser(inputStream);
        Set<Book> availableBooks = bookRentService.getAvailableBooks();
        bookRentService.searchAvailableBooks(availableBooks, bookTitle);
    }

    private String getBookTitleFromUser(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextLine();
    }
}