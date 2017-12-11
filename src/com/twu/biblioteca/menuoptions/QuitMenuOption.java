package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.BookRentService;

public class QuitMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Quit";
    }

    @Override
    public void execute(BookRentService bookRentService) {
        bookRentService.destroyApp();
    }
}
