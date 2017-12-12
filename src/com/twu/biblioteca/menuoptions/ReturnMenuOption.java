package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class ReturnMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Return Item";
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        libraryItemRentService.returnLibraryItem();
    }

}
