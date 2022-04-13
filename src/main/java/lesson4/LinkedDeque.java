package lesson4;

import lesson4.deque.Deque;

public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E> {
    private final TwoSideLinkedList<E> data;

    public LinkedDeque() {
        this.data = super.data;
    }

    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeFirst();
    }

    @Override
    public E removeRight() {
        E right = data.getLast();
        data.remove(right);
        return right;
    }
}
