package by.it.agadzhanov.jd01_11;

import java.util.*;

public class ListB<T> implements List<T> {

    private T[] elements = (T[]) new Object[0];
    private int size = 0;

    @Override
    public boolean add(T element) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements,size * 3 / 2 + 1);
        elements[size++] = element;
        return false;
    }

    @Override
    public void add(int index, T element) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements,size * 3 / 2 + 1);
         System.arraycopy(elements,index,elements,index + 1,size - index);
         elements[index] = element;
         size++;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] cElements = (T[]) new Object[c.size()];
        for (int i = 0; i < cElements.length; i++) {
            cElements[i] = ((List<? extends T>) c).get(i);
        }
        while (elements.length < size + c.size())
            elements = Arrays.copyOf(elements,elements.length * 3 / 2 + 1);
        System.arraycopy(cElements,0,elements,size,c.size());
        size = size + c.size();
        return false;
    }

    @Override
    public T remove(int index) {
        T deletedElement = elements[index];
        System.arraycopy(elements,index + 1,elements,index,size - index - 1);
        size--;
        return deletedElement;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        T oldElement = elements[index];
        elements[index] = element;
        return oldElement;
    }

    @Override
    public String toString() {
        StringBuilder strList = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            if (elements[i] == null)
                strList.append(delimiter).append("null");
            else
            strList.append(delimiter).append(elements[i].toString());
            delimiter = ", ";
        }
        strList.append("]");
        return strList.toString();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
