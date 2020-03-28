package by.it.liukhtenko.training.StreamWithCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Игорь", 38));
        persons.add(new Person("Аркалий", 37));
        persons.add(new Person("Сергей", 36));
        persons.add(new Person("Сергей", 15));
        persons.add(new Person("Сергей", 4));

        persons.stream().forEach((u) -> System.out.println(u));
        System.out.println();
        persons.stream().
                filter(person -> person.getAge() >= 18).
                sorted(Comparator.comparing(Person::getName)).
                forEach(System.out::println);
        //  persons.stream().forEach(System.out::println);

    }
}
