package com.twu.biblioteca;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MainMenuTest {
    static MainMenu menu;

    @BeforeClass
    public static void setUp() {
        System.out.println("setting up");
        menu = new MainMenu();
    }

    @Test
    public void shouldReturnMenuChoices() {
        String[] options = menu.menuOptions();
        assertEquals(options[0], "1. List Books");
    }

    @Test
    public void shouldGetFirstOptionFromUser() {
        InputStream fakeInput = new ByteArrayInputStream("1".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        assertEquals(userOption , 1);
    }

    @Test
    public void shouldCheckValidInput() {
        InputStream fakeInput = new ByteArrayInputStream("1".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionValid = menu.isOptionValid(userOption);
        assertTrue(isOptionValid);
    }

    @Test
    public void shouldCheckInvalidInput() {
        InputStream fakeInput = new ByteArrayInputStream("2".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionInvalid = menu.isOptionValid(userOption);
        assertFalse(isOptionInvalid);
    }

    @Test
    public void shouldQuit() {
        InputStream fakeInput = new ByteArrayInputStream("0".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionQuit = menu.checkIsQuit(userOption);
        assertTrue(isOptionQuit);
    }

    @Test
    public void shouldNotQuit() {
        InputStream fakeInput = new ByteArrayInputStream("1".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        boolean isOptionNotQuit = menu.checkIsQuit(userOption);
        assertFalse(isOptionNotQuit);
    }
}
