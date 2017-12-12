package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public interface IMenuOption {
    String name();
    void execute(LibraryRentService libraryRentService);
}
