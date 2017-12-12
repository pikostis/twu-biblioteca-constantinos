package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public class QuitMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Quit";
    }

    @Override
    public void execute(LibraryRentService libraryRentService) {
        libraryRentService.destroyApp();
    }
}
