package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class InvalidMenuOption implements IMenuOption {
    @Override
    public String name() {
        return null;
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        System.out.println("Select a valid option!");
    }
}
