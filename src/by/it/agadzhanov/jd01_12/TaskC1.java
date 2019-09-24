package by.it.agadzhanov.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskC1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> objectMap = new HashMap<>();

        while (scanner.hasNextLine()) {
            String object = scanner.nextLine();
            if (object.equals("end"))
                break;
            //Если в карте еще нет полученного объекта
            if (!objectMap.containsKey(object))
                objectMap.put(object, object.hashCode());
        }
        printMap(objectMap);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            String object = stringIntegerEntry.getKey();
            Integer hash = stringIntegerEntry.getValue();
            System.out.println(object + "=" + hash);
        }
    }
}
