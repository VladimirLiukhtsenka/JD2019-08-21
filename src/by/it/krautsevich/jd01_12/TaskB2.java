package by.it.krautsevich.jd01_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TaskB2 {

    static String process(ArrayList<String> peoples){
        while (peoples.size()>1) {
            peoples.trimToSize();
            for (int i = 0; i < (peoples.size()/2); i++) {
                System.out.println("delete - " + peoples.get(i*2+1));
                peoples.remove(i*2+1);} }

        return peoples.get(0);
    }

    public static void main(String[] args) {

        String [] names = {"Оля","Миша","Коля","Поля","Надя","Вика","Антон","Вова","Шура","Жора","Кузя","Вадик","Леша","Саша"};
        ArrayList <String> namesArray = new ArrayList<>(Arrays.asList(names)) ;
        LinkedList <String> namesLinked = new LinkedList<>(Arrays.asList(names)) ;

        System.out.println(namesArray.size());

        System.out.println(process(namesArray));


    }
}
