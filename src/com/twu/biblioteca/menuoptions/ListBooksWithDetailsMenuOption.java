package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class ListBooksWithDetailsMenuOption implements IMenuOption{
    @Override
    public String name() {
        return "List Books with Details";
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        libraryItemRentService.listAvailableLibraryItemsWithDetails();
    }
}
