package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.BookRentService;

public class ListBooksWithDetailsMenuOption implements IMenuOption{
    @Override
    public String name() {
        return "List Books with Details";
    }

    @Override
    public void execute(BookRentService bookRentService) {
        bookRentService.listAvailableBooksWithDetails();
    }
}
