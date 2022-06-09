package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CustomListTest {

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        CustomList<Object> list = new CustomList<>();

        // no momento o teste sempre vai falhar
        // o método isEmpty() apenas retorna false
        // vamos seguir com baby steps

        assertTrue(list.isEmpty());
    }
}
