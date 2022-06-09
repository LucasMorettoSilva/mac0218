package org.example;

public class CustomList<T> {

    private Object[] list;

    public CustomList() {
        this.list = new Object[]{};
    }

    public boolean isEmpty() {
        return false;
    }
}
