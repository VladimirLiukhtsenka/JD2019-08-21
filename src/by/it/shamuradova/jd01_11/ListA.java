package by.it.shamuradova.jd01_11;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ListA<E> implements List<E> {
    private int nextElementIndex =0;
    private Object[] array =  new Object[0];
    //private static final int DEFAULT_CAPACITY = 10;


    @Override
    public boolean add(E t) {
        if(nextElementIndex ==array.length){ // 0
            int oldCapasity=array.length; // oldCapacity = 0
            int newCapasity=oldCapasity+(oldCapasity/2*3+1); // newCapacity = 0 + (0/2*3+1)
            array=Arrays.copyOf(array, newCapasity);
        }
        array[nextElementIndex]=t;
        nextElementIndex++;
        return true;
    }
    @Override
    public E remove(int index) {
        if(index >= array.length || index<0) {
            System.out.println("this index " + index + "does not exist");
            throw new IllegalArgumentException();
        }
        E oldValue = (E) array[index];
        if(index==array.length-1){
            array[index]=null;
        }
        else if (index==0){
            array=Arrays.copyOfRange(array, 1, array.length); //мб ошибка
        }
        else{
            Object[] part1 = Arrays.copyOfRange(array, 0, index);
            Object[] part2 = Arrays.copyOfRange(array, index + 1, array.length);
            Object[] newArray = new Object[part1.length+part2.length];
            System.arraycopy(part1, 0 , newArray , 0, part1.length);
            System.arraycopy(part2,  0, newArray , part1.length, part2.length);
            array = newArray;
        }
        nextElementIndex--;
        return oldValue;
    }
    @Override
    public E get(int index) {
        return (E)array[index];
    }
    @Override
    public String toString(){
        StringBuilder arrayOut=new StringBuilder("[");
        String razdelitel = " ";
        for(int i=0; i<nextElementIndex; i++){
            razdelitel=", ";
            if(i==nextElementIndex-1) {
                arrayOut.append(array[i]);
            }
            else{
                arrayOut.append(array[i]).append(razdelitel);
            }
        }
        arrayOut.append("]");
        return arrayOut.toString();

    }

    @Override
    public int size() {
        return  nextElementIndex;
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
    public boolean addAll(Collection<? extends E> c) {
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
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

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
