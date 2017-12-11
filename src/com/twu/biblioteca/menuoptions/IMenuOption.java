package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.BookRentService;

public interface IMenuOption {
    String name();
    void execute(BookRentService bookRentService);
}
