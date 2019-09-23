package by.it.rojas.jd11;

import java.util.*;

public class ListB <E> implements List<E> {
    private int size = 0;
    private Object [] array = new Object[0];

    @Override
    public boolean add(E e) {
        if(size==array.length){
            int oldCapasity=array.length;
            int newCapasity=oldCapasity+(oldCapasity/2*3+1);
            array= Arrays.copyOf(array, newCapasity);
        }
        array[size]= e;
        size++;
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
            Object[] part1 = (Object[]) Arrays.copyOfRange(array, 0, index);
            Object[] part2 = (Object[]) Arrays.copyOfRange(array, index + 1, array.length);
            Object[] newArray = new Object[part1.length+part2.length];
            System.arraycopy(part1, 0 , newArray , 0, part1.length);
            System.arraycopy(part2,  0, newArray , part1.length, part2.length);
            array = newArray;
        }
        size--;
        return oldValue;
    }

    @Override
    public E get(int index) {
        return (E)array[index];
    }

    @Override
    public E set(int index, E element) {
        if(index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        E oldValue= (E) array[index];
        array[index]=element;
        return oldValue;
    }
    @Override
    public void add(int index, E element) {
        if(index>size){
            throw new ArrayIndexOutOfBoundsException();
        }
        else if(index==size) {
            add(element);
            return;
        }
        else if(index==0){
            Object [] part1 =  new Object [] { element};
            Object [] part2=Arrays.copyOf(array, array.length);
            Object [] newArray = new Object[part1.length+part2.length];
            System.arraycopy(part1,0, newArray, 0, part1.length);
            System.arraycopy(part2, 0, newArray, part1.length, part2.length);
            array=newArray;
        }
        else{
            Object [] part1=Arrays.copyOfRange(array, 0, index);   //мб ошибка System.arraycopy
            Object [] part2= new Object[]{element};
            Object [] part3=Arrays.copyOfRange(array, index, size);
            Object [] newArray= new Object[part1.length+part2.length+part3.length];
            System.arraycopy(part1,0, newArray, 0, part1.length);
            System.arraycopy(part2, 0, newArray, part1.length, part2.length);
            System.arraycopy(part3, 0, newArray, part1.length + part2.length, part3.length);
            array=newArray;
        }
        size++;
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] cArray = c.toArray();
        Object[] newArray = new Object[cArray.length + size];

        System.arraycopy(array, 0, newArray, 0, size);
        System.arraycopy(cArray, 0, newArray, size, cArray.length);

        array = newArray;
        size=newArray.length;
        return true;
    }
    @Override
    public String toString(){
        StringBuilder arrayOut=new StringBuilder("[");
        String razdelitel = " ";
        for(int i=0; i<size; i++){
            razdelitel=", ";
            if(i==size-1) {
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
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(java.lang.Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
    @Override
    public boolean remove(java.lang.Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    @Override
    public java.lang.Object[] toArray() {
        return new java.lang.Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
    @Override
    public int indexOf(java.lang.Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(java.lang.Object o) {
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
