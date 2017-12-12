package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;
import java.io.InputStream;
import java.util.Scanner;

public class CheckoutMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Checkout Book";
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        String bookTitle = getUserInput();
        libraryItemRentService.checkoutLibraryItem(bookTitle);
    }

    private String getUserInput() {
        InputStream inputStream = System.in;
        String bookTitle = null;
        while (bookTitle == null || bookTitle.isEmpty()) {
            System.out.println("Enter book title");
            bookTitle = getBookTitleFromUser(inputStream);
        }
        return bookTitle;
    }

    private String getBookTitleFromUser(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextLine();
    }
}
