package com.twu.biblioteca;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibraryItemRentService {

    public void listAvailableLibraryItems() {
        printLine();

        for (ILibraryItem libraryItem : libraryItems) {
            if (libraryItem.isItemAvailableForCheckout()) {
                System.out.println(libraryItem.getItemTitle());
            }
        }

        printLine();
    }

    public void listAvailableLibraryItemsWithDetails() {
        printLine();

        for (ILibraryItem libraryItem : libraryItems) {
            if (libraryItem.isItemAvailableForCheckout()) {
                System.out.println(libraryItem);
            }
        }

        printLine();
    }

    public void addLibraryItems(ILibraryItem libraryItem) {
        libraryItems.add(libraryItem);
    }

    public boolean checkoutLibraryItem() {
        String libraryItemTitle = getUserInput();

        ILibraryItem itemToCheckout = searchForLibraryItem(libraryItems, libraryItemTitle);

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

    public boolean returnLibraryItem() {
        String libraryItemTitle = getUserInput();

        ILibraryItem libraryItemToReturn = searchForLibraryItem(libraryItems, libraryItemTitle);

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

    public void destroyApp() {
        System.exit(0);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    private boolean isItemNotFound(ILibraryItem libraryItemToReturn) {
        return libraryItemToReturn.getItemTitle().equals(defaultErrorItem.getItemTitle());
    }

    private Set<ILibraryItem> libraryItems = new HashSet<ILibraryItem>();

    private String getUserInput() {
        InputStream inputStream = System.in;
        String bookTitle = null;
        while (bookTitle == null || bookTitle.isEmpty()) {
            System.out.println("Enter book title");
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

    private void printLine() {
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
