package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public class ListMoviesMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "List Movies";
    }

    public void execute(LibraryRentService libraryRentService) {
        System.out.println("Movie Title");
        libraryRentService.listAvailableMovies();
    }
}
