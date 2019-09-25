package by.it.zavadski.jd01_11;


import java.util.*;

public class ListB<E> implements List<E> {
    private E[] elements= (E[]) new Object[0];
    private int size=0;


    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            elements= Arrays.copyOf(elements,(elements.length/2+1)*3);
        }
        elements[size]=e;
        size++;
        return false;
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
    public void add(int index, E element) {
        if (size == elements.length) {
            elements= Arrays.copyOf(elements,(elements.length/2+1)*3);
        }
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index]=element;
        size++;

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if(size<elements.length+c.size()){
            elements=Arrays.copyOf(elements,size+c.size());
            System.arraycopy(c.toArray(),0,elements,size,c.size());
            size=size+c.size();
        }
        return false;
    }

    @Override
    public E remove(int index) {
        E removedElement=elements[index];
        System.arraycopy(elements,index+1,elements,index,size-1-index);
        size--;
        return removedElement;
    }
    @Override
    public E get(int index) {
        return elements[index];
    }
    @Override
    public E set(int index, E element) {
        E set=elements[index];
        elements[index]=element;
        return set;
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
    public <T> T[] toArray(T[] a) {
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
    public boolean addAll(int index, Collection<? extends E> c) {
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
        if(o==null){
            for (int i = 0; i <size ; i++) {
                if (elements[i]==null){
                    return i;
                }
                else    {
                    for (int j = 0; j < size; j++) {
                        if(o.equals(elements[j])){
                            return j;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
