package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public class ListMoviesWithDetailsMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "List Movies with Details";
    }

    @Override
    public void execute(LibraryRentService libraryRentService) {
        System.out.printf("%-30.30s %-30.30s %-30.30s %-30.30s%n", "Movie Name","| Director", "| Release Date", "| Rating");
        libraryRentService.listAvailableLibraryMoviesWithDetails();
    }
}
