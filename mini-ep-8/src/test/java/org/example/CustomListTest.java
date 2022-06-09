package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CustomListTest {

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        CustomList<Object> list = new CustomList<>();

        assertTrue(list.isEmpty());
    }
}
