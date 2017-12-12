package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class ReturnBookMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Return Book";
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        libraryItemRentService.returnBook();
    }

}
