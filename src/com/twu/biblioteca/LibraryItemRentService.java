package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class LibraryItemRentService {

    public void listAvailableLibraryItems() {
        printLine();
        System.out.println("Item Title");
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
        System.out.printf("%-30.30s %-30.30s %-30.30s%n", "Title","| Author", "| Release Date");
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

    public boolean checkoutLibraryItem(String itemTitle) {
        ILibraryItem itemToCheckout = searchForLibraryItem(libraryItems, itemTitle);

        boolean isItemNotFound = itemToCheckout.getItemTitle().equals(defaultErrorItem.getItemTitle());

        if (itemToCheckout.isItemAvailableForCheckout() && !isItemNotFound) {
            System.out.println("Thank you! Enjoy the book");
            itemToCheckout.setItemAvailableForCheckout(false);
            return true;
        } else {
            System.out.println("That book is not available.");
            return false;
        }
    }

    public boolean returnLibraryItem(String libraryItemTitle) {
        ILibraryItem libraryItemToReturn = searchForLibraryItem(libraryItems, libraryItemTitle);

        boolean isItemNotFound = libraryItemToReturn.getItemTitle().equals(defaultErrorItem.getItemTitle());
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

    private Set<ILibraryItem> libraryItems = new HashSet<ILibraryItem>();

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
