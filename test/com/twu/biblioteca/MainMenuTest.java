package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MainMenuTest {

    @Test
    public void shouldReturnMenuChoices() {
        MainMenu menu = new MainMenu();
        String[] options = menu.listOptions();
        assertEquals(options[0], "1. List Books");
    }

    @Test
    public void shouldGetFirstOptionFromUser() {
        MainMenu menu = new MainMenu();
        InputStream fakeInput = new ByteArrayInputStream("1".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        assertEquals(userOption , 1);
    }

    @Test
    public void shouldCheckValidInput() {
        MainMenu menu = new MainMenu();
        InputStream fakeInput = new ByteArrayInputStream("1".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionValid = menu.checkIfOptionIsValid(userOption);
        assertTrue(isOptionValid);
    }

    @Test
    public void shouldCheckInvalidInput() {
        MainMenu menu = new MainMenu();
        InputStream fakeInput = new ByteArrayInputStream("2".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionInvalid = menu.checkIfOptionIsValid(userOption);
        assertFalse(isOptionInvalid);
    }

    @Test
    public void shouldQuit() {
        MainMenu menu = new MainMenu();
        InputStream fakeInput = new ByteArrayInputStream("0".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionQuit = menu.checkIsQuit(userOption);
        assertTrue(isOptionQuit);
    }

    @Test
    public void shouldNotQuit() {
        MainMenu menu = new MainMenu();
        InputStream fakeInput = new ByteArrayInputStream("1".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionNotQuit = menu.checkIsQuit(userOption);
        assertFalse(isOptionNotQuit);
    }
}
