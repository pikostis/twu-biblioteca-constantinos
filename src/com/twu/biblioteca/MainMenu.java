package com.twu.biblioteca;

import java.io.InputStream;
import java.util.Scanner;

public class MainMenu {
    private String[] options = new String[1];

    public MainMenu() {
        options[0] = "1. List Books";
    }

    public String[] listOptions() {
        return options;
    }

    public int getUserOption(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextInt();
    }

    public boolean checkIfOptionIsValid(int userOption) {
        return (userOption >= 1 && userOption <= 1) ? true : false;
    }
}
