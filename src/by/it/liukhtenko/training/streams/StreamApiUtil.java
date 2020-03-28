package by.it.liukhtenko.training.streams;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiUtil {
    public static List<Specialist> getSpecialists() {
        return List.of(
                new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER),
                new Specialist("Alexandrov Alexandrov", new BigDecimal(4000), Specialty.ENGINEER),
                new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS),
                new Specialist("Fedor Fedorov", new BigDecimal(2000), Specialty.DEVOPS),
                new Specialist("Kirill Kirillov", new BigDecimal(10000), Specialty.MANAGER),
                new Specialist("Petr petrov", new BigDecimal(10000), Specialty.MANAGER)
        );
    }

    public static List<Specialist> filterBySpeciality(List<Specialist> specialists, Specialty specialty) {
        return specialists.stream().filter(specialist -> specialist.getSpecialty().equals(specialty)).collect(Collectors.toList());
    }

    public static List<Specialist> sortByNameAsk(List<Specialist> specialists){
      return   specialists.stream().sorted(Comparator.comparing(Specialist::getName)).
                collect(Collectors.toList());
    }
    public static List<Specialist> sortByNameDesk(List<Specialist> specialists){
        return   specialists.stream().sorted(Comparator.comparing(Specialist::getName).reversed()).
                collect(Collectors.toList());
    }

    public static Specialist findWithMaxSalary(List<Specialist> specialists){
        return specialists.stream().max(Comparator.comparing(Specialist::getSalary)).orElse(null);
    }

    public static Specialist findWithMinSalary(List<Specialist> specialists){
        return specialists.stream().min(Comparator.comparing(Specialist::getSalary)).orElse(null);
    }
    public static Map<Specialty,List<Specialist>> groupBySpecialty(List<Specialist>specialists){
        return specialists.stream().collect(Collectors.groupingBy(Specialist::getSpecialty));
    }
}

