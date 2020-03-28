package by.it.liukhtenko.training.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OldApproachUtil {
    public static List<Specialist> getSpecialists() {
        List<Specialist> result = new ArrayList<>();
        result.add(new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER));
        result.add(new Specialist("Alexandrov Alexandrov", new BigDecimal(4000), Specialty.ENGINEER));
        result.add(new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS));
        result.add(new Specialist("Fedor Fedorov", new BigDecimal(2000), Specialty.DEVOPS));
        result.add(new Specialist("Kirill Kirillov", new BigDecimal(10000), Specialty.MANAGER));
        result.add(new Specialist("Petr petrov", new BigDecimal(10000), Specialty.MANAGER));
        return result;
    }

    public static List<Specialist> filterBySpeciality(List<Specialist> specialists, Specialty specialty) {
        List<Specialist> result = new ArrayList<>();
        for (Specialist specialty1 : specialists) {
            if (specialty1.getSpecialty().equals(specialty)) {
                result.add(specialty1);
            }
        }
        return result;
    }
}
