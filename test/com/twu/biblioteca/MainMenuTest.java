package com.twu.biblioteca;

import com.twu.biblioteca.menuoptions.IMenuOption;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import static junit.framework.TestCase.assertEquals;

public class MainMenuTest {
    static MainMenu menu;

    @BeforeClass
    public static void setUp() {
        System.out.println("setting up");
        menu = new MainMenu();
    }

    @Test
    public void shouldReturnMenuChoices() {
        Map<Integer, IMenuOption> options = menu.menuOptions();
        assertEquals(options.get(0).name(), "List Books");
    }

    @Test
    public void shouldGetFirstOptionFromUser() {
        InputStream fakeInput = new ByteArrayInputStream("1".getBytes());;
        int userOption = menu.getUserOption(fakeInput);
        assertEquals(userOption , 1);
    }
}
