package com.twu.biblioteca.menuoptions;

import com.twu.biblioteca.LibraryRentService;

public class CheckoutBookMenuOption implements IMenuOption {
    @Override
    public String name() {
        return "Checkout Book";
    }

    @Override
    public void execute(LibraryRentService libraryRentService) {
        libraryRentService.checkoutBook();
    }
}
