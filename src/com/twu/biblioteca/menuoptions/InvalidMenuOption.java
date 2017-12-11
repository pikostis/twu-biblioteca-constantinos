package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.BookRentService;

public class InvalidMenuOption implements IMenuOption {
    @Override
    public String name() {
        return null;
    }

    @Override
    public void execute(BookRentService bookRentService) {
        System.out.println("Select a valid option!");
    }
}
