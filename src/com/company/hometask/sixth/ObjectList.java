package com.company.hometask.sixth;


public class ObjectList {

    private final int size = 16;
    private int count = 0;

    private Object[] array = new Object[size];

    public void add(Object object) {
        if (count == array.length - 1) {
            resize(array.length * 2);
        }
        array[count++] = object;
    }

    public Object get(int index) {
        return array[index];
    }

    public void getObjectList() {
        for (int i = 0; i < this.size; i++) {
            if (array[i] == null) {
                return;
            } else {
                System.out.println(array[i]);
            }
        }
    }

    private void resize(int newLength) {
        array = new Object[newLength];
    }
}
