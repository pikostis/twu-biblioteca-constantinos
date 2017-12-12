package com.twu.biblioteca;

import com.twu.biblioteca.menuoptions.IMenuOption;
import com.twu.biblioteca.menuoptions.InvalidMenuOption;

import java.io.InputStream;
import java.util.Date;
import java.util.Map;

public class LibraryService {
    LibraryItemRentService libraryItemRentService = new LibraryItemRentService();

    public void run() {
        createMovies();
        createBooks();
        createMainMenu(libraryItemRentService);
    }

    private void createMainMenu(LibraryItemRentService libraryItemRentService) {
        MainMenu mainMenu = new MainMenu();
        int option;
        IMenuOption userOption;
        InputStream inputStream = System.in;

        Map<Integer, IMenuOption> menuOptions = mainMenu.menuOptions();

        do {
            mainMenu.listMenuOptions();
            option = mainMenu.getUserOption(inputStream);
            userOption = menuOptions.getOrDefault(option, new InvalidMenuOption());
            userOption.execute(libraryItemRentService);
        } while(true);
    }

    private void createBooks() {
        String bookAuthor = "Kent Beck";
        String bookTitle = "TDD by example";
        Date bookReleaseDate = new Date(1990, 2, 23);
        Book book = new Book(bookTitle, bookAuthor, bookReleaseDate);
        book.setItemAvailableForCheckout(true);

        bookAuthor = "Kent Beck 2";
        bookTitle = "TDD by example 2";
        bookReleaseDate = new Date(1990,2,23);
        Book book2 = new Book(bookTitle, bookAuthor, bookReleaseDate);
        book2.setItemAvailableForCheckout(true);

        libraryItemRentService.addBooks(book);
        libraryItemRentService.addBooks(book2);
    }

    private void createMovies() {
        String movieName = "Movie 1";
        String movieDirector = "John Appleseed";
        Date movieReleaseDate = new Date(1990,2,23);
        int rating = 7;

        Movie movie = new Movie(movieName, movieDirector, movieReleaseDate, rating);
        movie.setItemAvailableForCheckout(true);
        libraryItemRentService.addMovies(movie);
    }
}
