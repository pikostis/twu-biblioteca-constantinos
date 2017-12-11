package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.BookRentService;
import java.io.InputStream;
import java.util.Scanner;

public class CheckoutMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Checkout Book";
    }

    @Override
    public void execute(BookRentService bookRentService) {
        InputStream inputStream = System.in;
        System.out.println("Enter book title");
        String bookTitle = getBookTitleFromUser(inputStream);
        bookRentService.checkoutBook(bookTitle);
    }

    private String getBookTitleFromUser(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextLine();
    }
}
