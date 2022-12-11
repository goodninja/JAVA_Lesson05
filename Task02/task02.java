// 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class task02 {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Абдулла");
        namesList.add("Альфред");
        namesList.add("Адольф");
        namesList.add("Аладдин");
        namesList.add("Адольф");
        namesList.add("Арнольд");
        namesList.add("Альберт");
        namesList.add("Альбрехт");
        namesList.add("Альберт");
        namesList.add("Аладдин");
        namesList.add("Адольф");
        namesList.add("Абдулла");
        namesList.add("Азраэль");
        namesList.add("Азраэль");
        namesList.add("Адольф");
        namesList.add("Аладдин");
        namesList.add("Адольф");
        namesList.add("Арнольд");

        System.out.printf("В ArrayList содержится %d элементов \n", namesList.size());
        for (String worker : namesList) {
            System.out.println(worker);
        }

        Map<String, Integer> hashMap = new HashMap<>();
        for (String worker : namesList) {
            String person = worker;
            Integer frequency = hashMap.get(person);
            hashMap.put(person, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap);

        ArrayList<Map.Entry<String, Integer>> mappings = new ArrayList<>(hashMap.entrySet());
        Collections.sort(mappings, Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(mappings);
        Map<String, Integer> linkedHashMapSort = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : mappings) {
            linkedHashMapSort.put(entry.getKey(), entry.getValue());
        }
        System.out.println(linkedHashMapSort);

    }

}