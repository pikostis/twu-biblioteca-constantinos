package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class QuitMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Quit";
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        libraryItemRentService.destroyApp();
    }
}
