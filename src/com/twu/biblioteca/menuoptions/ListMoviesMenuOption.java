package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class ListMoviesMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "List Movies";
    }

    public void execute(LibraryItemRentService libraryItemRentService) {
        System.out.println("Movie Title");
        libraryItemRentService.listAvailableMovies();
    }
}
