package com.twu.biblioteca;

import com.twu.biblioteca.menuoptions.ListBooksMenuOption;
import org.junit.Test;

import java.util.Date;

public class ListBooksMenuOptionTest {

    @Test
    public void shouldReturnAllBooks() {
        String bookAuthor = "Kent Beck";
        String bookTitle = "TDD by example";
        Date bookReleaseDate = new Date(1990,2,23);

        Book book = new Book(bookTitle, bookAuthor, bookReleaseDate);

        BookRentService bookRentService = new BookRentService();
        bookRentService.addAvailableBook(book);

        ListBooksMenuOption listBooksMenuOption = new ListBooksMenuOption();
        listBooksMenuOption.execute(bookRentService);
    }
}
