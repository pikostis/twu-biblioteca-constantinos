package com.twu.biblioteca;

import com.twu.biblioteca.menuoptions.IMenuOption;
import com.twu.biblioteca.menuoptions.InvalidMenuOption;

import java.io.InputStream;
import java.util.Date;
import java.util.Map;

public class LibraryService {
    public void run() {
        BookRentService bookRentService = initializeBookRentServiceWithBooks();
        createMainMenu(bookRentService);
    }

    private void createMainMenu(BookRentService bookRentService) {
        MainMenu mainMenu = new MainMenu();
        int option;
        IMenuOption userOption;
        InputStream inputStream = System.in;

        Map<Integer, IMenuOption> menuOptions = mainMenu.menuOptions();

        do {
            mainMenu.listMenuOptions();
            option = mainMenu.getUserOption(inputStream);
            userOption = menuOptions.getOrDefault(option, new InvalidMenuOption());
            userOption.execute(bookRentService);
        } while(true);
    }

    private BookRentService initializeBookRentServiceWithBooks() {
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

        BookRentService bookRentService = new BookRentService();
        bookRentService.addBooks(book);
        bookRentService.addBooks(book2);
        return bookRentService;
    }
}
