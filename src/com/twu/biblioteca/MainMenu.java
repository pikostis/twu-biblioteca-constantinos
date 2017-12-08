package com.twu.biblioteca;

import java.io.InputStream;
import java.util.Scanner;

public class MainMenu {
    private static final int QUIT_OPTION = 0;
    private String[] options = new String[1];
    private int optionsSize = options.length;

    public MainMenu() {
        options[0] = "1. List Books";
        welcomeMessage();
    }

    private void welcomeMessage() {
        System.out.println("Welcome to Biblioteca. Biblioteca is up and running...");
    }

    public String[] menuOptions() {
        return options;
    }

    public void listMenuOptions() {
        for (String option : options){
            System.out.println(option);
        }
    }

    public int getUserOption(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextInt();
    }

    public boolean isOptionValid(int userOption) {
        if (userOption >= optionsSize && userOption <= optionsSize) {
            return true;
        } else {
            System.out.println("Select a valid option!");
            return false;
        }
    }

    public boolean checkIsQuit(int userOption) {
        return userOption == QUIT_OPTION;
    }
}
