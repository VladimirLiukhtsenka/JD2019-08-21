package by.it.agadzhanov.jd01_11;

import java.util.*;

public class SetC<T> implements Set<T> {

    private T[] elements = (T[]) new Object[0];
    private int size = 0;

    @Override
    public boolean add(T element) {
        //Если элемент уже есть в массиве
        for (int i = 0; i < size; i++) {
            T[] array1 = (T[]) new Object[1];
            array1[0] = elements[i];
            T[] array2 = (T[]) new Object[1];
            array2[0] = element;
            if (Arrays.equals(array1,array2))
                return false;
        }
        //Если элемента еще нет в массиве
        if (size == elements.length)
            elements = Arrays.copyOf(elements, size * 3 / 2 + 1);

        //Если element является null
        if (element == null) {
            System.arraycopy(elements,0,elements,1,size);
            elements[0] = null;
            size++;
            return true;
        }

        //Поставить element в позицию массива, который отсортирован по хэшкоду по возрастанию
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) continue;;
            if (elements[i].hashCode() >= element.hashCode()) {
                System.arraycopy(elements,i,elements,i+1,size - i);
                elements[i] = element;
                size++;
                return true;
            }
        }

        //Если хэшкод element самый большой
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] cElements = (T[]) new Object[c.size()];
        for (int i = 0; i < cElements.length; i++) {
            cElements[i] = ((List<? extends T>) c).get(i);
        }
        for (T cElement : cElements) {
            SetC.this.add(cElement);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        boolean isPresent = false;
        int oIndex = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                isPresent = true;
                oIndex = i;
            }
        }
        //Если o не встретился
        if (!isPresent)
            return false;
        else {
            System.arraycopy(elements,oIndex + 1,elements,oIndex,size - oIndex - 1);
            size--;
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            T[] array1 = (T[]) new Object[1];
            array1[0] = elements[i];
            T[] array2 = (T[]) new Object[1];
            array2[0] = (T) o;
            if (Arrays.equals(array1,array2))
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        T[] cElements =(T[]) c.toArray();
        int neededElements = 0;
        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < size; j++) {
                T[] array1 = (T[]) new Object[1];
                array1[0] = elements[i];
                T[] array2 = (T[]) new Object[1];
                array2[0] = elements[j];
                if (Arrays.equals(array1,array2))
                    neededElements++;
            }
        }
        return neededElements == c.size();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        T[] cElements =(T[]) c.toArray();
        boolean changed = false;
        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < size; j++) {
                if (cElements[i] == elements[j]) {
                    SetC.this.remove(cElements[i]);
                    changed = true;
                }
            }
        }
        return changed;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            SetC.this.remove(elements[i]);
        }
        size = 0;
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
        return size;
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
    public boolean retainAll(Collection<?> c) {
        return false;
    }
}
