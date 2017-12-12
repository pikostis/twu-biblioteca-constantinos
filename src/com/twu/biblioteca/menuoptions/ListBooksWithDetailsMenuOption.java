package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class ListBooksWithDetailsMenuOption implements IMenuOption{
    @Override
    public String name() {
        return "List Books with Details";
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        System.out.printf("%-30.30s %-30.30s %-30.30s%n", "Book Title","| Author", "| Release Date");
        libraryItemRentService.listAvailableLibraryItemsWithDetails();
    }
}
