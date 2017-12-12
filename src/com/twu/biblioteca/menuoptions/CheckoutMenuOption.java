package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryItemRentService;

public class CheckoutMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Checkout Book";
    }

    @Override
    public void execute(LibraryItemRentService libraryItemRentService) {
        libraryItemRentService.checkoutLibraryItem();
    }
}
