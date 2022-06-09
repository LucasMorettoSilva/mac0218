package org.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomListTest {

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        CustomList<Object> list = new CustomList<>();

        // agora o teste deve passar, visto
        // que existe lógica real no método
        assertTrue(list.isEmpty());
    }

    @Test
    public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
        CustomList<String> list = new CustomList<>();
        list.add("my string");

        // testando outro cenário
        // também deve passar
        assertFalse(list.isEmpty());
    }
}
