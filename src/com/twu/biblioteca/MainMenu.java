package com.twu.biblioteca;

import com.twu.biblioteca.menuoptions.*;

import java.io.InputStream;
import java.util.*;

public class MainMenu {
    private Map<Integer, IMenuOption> options = new HashMap<Integer, IMenuOption>();

    public MainMenu() {
        options.put(0, new ListBooksMenuOption());
        options.put(1, new ListBooksWithDetailsMenuOption());
        options.put(2, new ListMoviesMenuOption());
        options.put(3, new ListMoviesWithDetailsMenuOption());
        options.put(4, new CheckoutBookMenuOption());
        options.put(5, new ReturnBookMenuOption());
        options.put(6, new QuitMenuOption());

        welcomeMessage();
    }

    private void welcomeMessage() {
        System.out.println("Welcome to Biblioteca. Biblioteca is up and running...");
    }

    public Map<Integer, IMenuOption> menuOptions() {
        return options;
    }

    public void listMenuOptions() {
        System.out.println();
        System.out.println("---------------------MENU---------------------");

        for (Object obj : options.entrySet()) {
            Map.Entry<Integer, IMenuOption> entry = (Map.Entry) obj;
            System.out.print(entry.getKey() + ". ");
            System.out.println(entry.getValue().name());
        }

        System.out.println("----------------------------------------------");
        System.out.println();
    }

    public int getUserOption(InputStream inputStream) {
        Scanner input = new Scanner(inputStream);
        return input.nextInt();
    }

}
