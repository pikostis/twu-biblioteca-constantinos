package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public class ReturnBookMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Return Book";
    }

    @Override
    public void execute(LibraryRentService libraryRentService) {
        libraryRentService.returnBook();
    }

}
