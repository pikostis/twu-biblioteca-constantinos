package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public class ListBooksMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "List Books";
    }

    public void execute(LibraryRentService libraryRentService) {
        System.out.println("Book Title");
        libraryRentService.listAvailableBooks();
    }
}
