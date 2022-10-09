package ru.kmetha.oop.homework2.task1;

public class MyLinkedList<E> {

    Node<E> first = new Node<E>(null);

    Node<E> last = first;

    private int size;

    private void add(E value) {
        last = last.next = new Node<E>(value);
        size++;
    }

    private E get(int index) {
        if(index < 0 || size <= index)
            throw new OutOfBoundsException(index);
        Node<E> node = first.next;
        while(index > 0) {
            node = node.next;
            index--;
        }
        return node.value;
    }

    private int size() {
        return size;
    }

    static class Node<E> {
        E value;

        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }
}
