package by.it.yuntsevich.jd01_11;

import java.util.*;

public class SetC<E> implements Set<E> {
    private E[] elements = (E[]) new Object[0];

    private int size = 0;

    @Override
    public boolean add(E e) {

        for (int i = 0; i < size; i++) {
            E[] array1 = (E[]) new Object[1];
            array1[0] = elements[i];
            E[] array2 = (E[]) new Object[1];
            array2[0] = e;
            if (Arrays.equals(array1, array2))
                return false;
        }

        if (e == null) {
            System.arraycopy(elements, 0, elements, 1, size);
            elements[0] = null;
            size++;
            return true;
        }
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }


        for (int i = 0; i < size; i++) {

            if (elements[i].hashCode() >= e.hashCode()) {
                System.arraycopy(elements, i, elements, i + 1, size - i);
                elements[i] = e;
                size++;
                return true;
            }
        }
            elements[size] = e;
        size++;

        return true;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            E[] array1 = (E[]) new Object[1];
            array1[0] = elements[i];
            E[] array2 = (E[]) new Object[1];
            array2[0] = (E)o;
            if (Arrays.equals(array1, array2))
                return true;
        }
        return false;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }


    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            out.append(delimiter).append(elements[i]);
            delimiter = ", ";
        }
        out.append("]");
        return out.toString();
    }


    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
