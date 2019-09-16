package by.it.zavadski.jd01_11;

import java.net.BindException;
import java.util.*;

public class SetC<E> implements Set<E> {
    private E[] elements=(E[]) new Object[0];
    private int size=0;

    @Override
    public boolean add(E e) {
        if(!contains(e)){
        if (size == elements.length) {
            elements= Arrays.copyOf(elements,(elements.length/2+1)*3);
            elements[size++]=e;
            return true;}
    }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Object[] contains=c.toArray();
        boolean result=true;
        for (Object contain : contains) {
            result=result&&contains(contain);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        E[] added=(E[]) c.toArray();
        Collections.addAll(this,added);
        return true;
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
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder("[");
        String delimiter="";
        for (int i = 0; i < size; i++) {
            stringBuilder.append(delimiter).append(elements[i]);
            delimiter=", ";
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
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
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
