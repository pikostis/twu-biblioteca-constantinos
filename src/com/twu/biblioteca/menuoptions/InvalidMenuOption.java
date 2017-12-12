package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public class InvalidMenuOption implements IMenuOption {
    @Override
    public String name() {
        return null;
    }

    @Override
    public void execute(LibraryRentService libraryRentService) {
        System.out.println("Select a valid option!");
    }
}
