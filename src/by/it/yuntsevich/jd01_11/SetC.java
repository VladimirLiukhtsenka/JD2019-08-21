package by.it.yuntsevich.jd01_11;

import java.util.*;

public class SetC<E> implements Set<E> {
    private E[] elements=(E[])new Object[0];

    private int size =0;

    @Override
    public boolean add(E e) {
        if (e==null) return false;

        if (!contains(e)) {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
            }
            elements[size++] = e;
            boolean isSorted = false;
            E buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < elements.length-2; i++) {
                   // System.out.println(elements[i] + " " +elements[i+1]);
                    if(elements[i].hashCode() > elements[i+1].hashCode()){
                        isSorted = false;

                        buf = elements[i];
                        elements[i] = elements[i+1];
                        elements[i+1] = buf;
                    }
                }
            }
        }


        return !contains(e);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        boolean isElementExists = false;
        for (E element : elements) {
            if (element.equals(o)) {
                isElementExists = true;
                break;
            }
        }
         return isElementExists;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
