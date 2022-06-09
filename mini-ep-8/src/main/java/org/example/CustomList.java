package org.example;

import java.util.Arrays;

public class CustomList<T> {

    private Object[] list;

    public CustomList() {
        this.list = new Object[]{};
    }

    public boolean isEmpty() {
        // adicionando lógica real ao método
        // durante o segundo ciclo de TDD
        return list.length == 0;
    }

    public void add(final T element) {
        // simples implementação para adicionar items a lista
        final Object[] temp = Arrays.copyOf(list, list.length + 1);
        temp[list.length] = element;
        list = temp;
    }
}
