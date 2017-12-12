package com.twu.biblioteca;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibraryItemRentService {

    public void listAvailableBooks() {
        printLine(20);

        for (ILibraryItem libraryItem : books) {
            if (libraryItem.isItemAvailableForCheckout()) {
                System.out.println(libraryItem.getItemTitle());
            }
        }

        printLine(20);
    }

    public void listAvailableMovies() {
        printLine(20);

        for (ILibraryItem libraryItem : movies) {
            if (libraryItem.isItemAvailableForCheckout()) {
                System.out.println(libraryItem.getItemTitle());
            }
        }

        printLine(20);
    }

    public void listAvailableLibraryBooksWithDetails() {
        printLine(92);

        for (ILibraryItem libraryItem : books) {
            if (libraryItem.isItemAvailableForCheckout()) {
                System.out.println(libraryItem);
            }
        }

        printLine(92);
    }

    public void listAvailableLibraryMoviesWithDetails() {
        printLine(101);

        for (ILibraryItem libraryItem : movies) {
            if (libraryItem.isItemAvailableForCheckout()) {
                System.out.println(libraryItem);
            }
        }

        printLine(101);
    }

    public void addBooks(ILibraryItem libraryItem) {
        books.add(libraryItem);
    }

    public void addMovies(ILibraryItem libraryItem) {
        movies.add(libraryItem);
    }

    public boolean checkoutBook() {
        String libraryItemTitle = getUserInput();

        ILibraryItem itemToCheckout = searchForLibraryItem(books, libraryItemTitle);

        boolean isItemNotFound = isItemNotFound(itemToCheckout);

        if (itemToCheckout.isItemAvailableForCheckout() && !isItemNotFound) {
            System.out.println("Thank you! Enjoy the book");
            itemToCheckout.setItemAvailableForCheckout(false);
            return true;
        } else {
            System.out.println("That book is not available.");
            return false;
        }
    }

    public boolean checkoutMovie() {
        String libraryItemTitle = getUserInput();

        ILibraryItem itemToCheckout = searchForLibraryItem(movies, libraryItemTitle);

        boolean isItemNotFound = isItemNotFound(itemToCheckout);

        if (itemToCheckout.isItemAvailableForCheckout() && !isItemNotFound) {
            System.out.println("Thank you! Enjoy the movie");
            itemToCheckout.setItemAvailableForCheckout(false);
            return true;
        } else {
            System.out.println("That movie is not available.");
            return false;
        }
    }

    public boolean returnBook() {
        String libraryItemTitle = getUserInput();

        ILibraryItem libraryItemToReturn = searchForLibraryItem(books, libraryItemTitle);

        boolean isItemNotFound = isItemNotFound(libraryItemToReturn);
        boolean isBookAvailableForReturn = !libraryItemToReturn.isItemAvailableForCheckout();

        if (isBookAvailableForReturn && !isItemNotFound) {
            System.out.println("Thank you for returning the book.");
            libraryItemToReturn.setItemAvailableForCheckout(true);
            return true;
        } else {
            System.out.println("That is not a valid book to return.");
            return false;
        }
    }

    public boolean returnMovie() {
        String libraryItemTitle = getUserInput();

        ILibraryItem libraryItemToReturn = searchForLibraryItem(movies, libraryItemTitle);

        boolean isItemNotFound = isItemNotFound(libraryItemToReturn);
        boolean isBookAvailableForReturn = !libraryItemToReturn.isItemAvailableForCheckout();

        if (isBookAvailableForReturn && !isItemNotFound) {
            System.out.println("Thank you for returning the movie.");
            libraryItemToReturn.setItemAvailableForCheckout(true);
            return true;
        } else {
            System.out.println("That is not a valid movie to return.");
            return false;
        }
    }

    public void destroyApp() {
        System.exit(0);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    private Set<ILibraryItem> books = new HashSet<ILibraryItem>();
    private Set<ILibraryItem> movies = new HashSet<ILibraryItem>();


    private boolean isItemNotFound(ILibraryItem libraryItemToReturn) {
        return libraryItemToReturn.getItemTitle().equals(defaultErrorItem.getItemTitle());
    }

    private String getUserInput() {
        InputStream inputStream = System.in;
        String bookTitle = null;
        while (bookTitle == null || bookTitle.isEmpty()) {
            System.out.println("Enter item title");
            bookTitle = getBookTitleFromUser(inputStream);
        }
        return bookTitle;
    }

    private String getBookTitleFromUser(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextLine();
    }

    private ILibraryItem searchForLibraryItem(Set<ILibraryItem> libraryItems, String libraryItemTitle) {
        ILibraryItem libraryItemToSearch;

        for (ILibraryItem libraryItem : libraryItems) {
            if (libraryItem.getItemTitle().equals(libraryItemTitle)) {
                libraryItemToSearch = libraryItem;
                return libraryItemToSearch;
            }
        }
        return defaultErrorItem;
    }

    private ILibraryItem defaultErrorItem = new ILibraryItem() {
        @Override
        public boolean isItemAvailableForCheckout() {
            return false;
        }

        @Override
        public void setItemAvailableForCheckout(boolean setItemAvailableForCheckout) {

        }

        @Override
        public String getItemTitle() {
            return "-1Error";
        }
    };

    private void printLine(int numberOfChars) {
        for (int i = 0; i < numberOfChars; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
