package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class ListBooksMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "List Books";
    }

    public void execute(LibraryItemRentService libraryItemRentService) {
        System.out.println("Book Title");
        libraryItemRentService.listAvailableLibraryItems();
    }
}
