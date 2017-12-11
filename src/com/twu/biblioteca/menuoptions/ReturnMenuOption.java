package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.BookRentService;
import java.io.InputStream;
import java.util.Scanner;

public class ReturnMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Return Book";
    }

    @Override
    public void execute(BookRentService bookRentService) {
        InputStream inputStream = System.in;
        String bookTitle = getBookTitleFromUser(inputStream);
        bookRentService.returnBook(bookTitle);
    }

    private String getBookTitleFromUser(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextLine();
    }
}
