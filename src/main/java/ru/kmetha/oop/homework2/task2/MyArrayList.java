package ru.kmetha.oop.homework2.task2;

/**
 * Реализация основных методов ArrayList
 */
public class MyArrayList<E> {

    private static final int INIT_SIZE = 10;

    Object[] array;

    private int size;

    public MyArrayList() {
        array = new Object[INIT_SIZE];
    }

    private void add(E item) {
        if (size == array.length - 1) {
            resize(array.length * 2);
        }
        array[size++] = item;
    }

    private void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        if (array.length > INIT_SIZE && size < array.length / 4)
            resize(array.length / 2);
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private E get(int index) {
        return (E) array[index];
    }

    private int size() {
        return size;
    }
}
