package by.it.liukhtenko.training.streams;

import java.util.List;
import java.util.Map;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Specialist> specialists = StreamApiUtil.getSpecialists();
//filter
        //List<Specialist> engineers = OldApproachUtil.filterBySpeciality(specialists,Specialty.ENGINEER);
//        List<Specialist> engineers = StreamApiUtil.filterBySpeciality(specialists,Specialty.ENGINEER);
//        System.out.println(engineers);
//sorted
//        List<Specialist> specialistAsk = StreamApiUtil.sortByNameAsk(specialists);
//        List<Specialist> specialistDesk = StreamApiUtil.sortByNameDesk(specialists);
//        System.out.println(specialistAsk);
//        System.out.println(specialistDesk);
//Max salary
//        Specialist specialistMax = StreamApiUtil.findWithMaxSalary(specialists);
//        System.out.println(specialistMax);
//Min salary
//        Specialist specialistMin = StreamApiUtil.findWithMinSalary(specialists);
//        System.out.println(specialistMin);
//Grouping
        Map<Specialty,List<Specialist>> listMap = StreamApiUtil.groupBySpecialty(specialists);
        for (Map.Entry<Specialty, List<Specialist>> specialtyListEntry : listMap.entrySet()) {
            System.out.println(specialtyListEntry);
        }
    }
}
