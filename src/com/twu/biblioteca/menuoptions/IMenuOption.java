package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public interface IMenuOption {
    String name();
    void execute(LibraryItemRentService libraryItemRentService);
}
