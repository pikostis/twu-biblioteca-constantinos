package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.BookRentService;

public class ListBooksMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "List Books";
    }

    public void execute(BookRentService bookRentService) {
        bookRentService.listAvailableBooks();
    }
}
