package com.twu.biblioteca;

public interface ILibraryItem {
    boolean isItemAvailableForCheckout();
    void setItemAvailableForCheckout(boolean setItemAvailableForCheckout);
    String getItemTitle();
}
