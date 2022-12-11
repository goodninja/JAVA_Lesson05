// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

package Task01;

import java.util.ArrayList;
import java.util.HashMap;

public class task01 {
    public static void main (String[] args) {

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        
        ArrayList<String> phoneContact1 = new ArrayList<>();
        phoneContact1.add("мобильный1 +7 232 678");
        phoneContact1.add("мобильный2 +7 920 655");
        phoneContact1.add("рабочий1 +7 990 725");
        phoneContact1.add("домашний1 +7 889 002");
        phoneBook.putIfAbsent("Вольфрам Молибденович Какэнпукский", phoneContact1);
        
        ArrayList<String> phoneContact2 = new ArrayList<>();
        phoneContact2.add("мобильный1 +7 779 923");
        phoneContact2.add("мобильный2 +7 445 822");
        phoneContact2.add("рабочий1 +7 783 923");
        phoneContact2.add("рабочий2 +7 992 663");
        phoneContact2.add("домашний1 +7 966 226");
        phoneBook.putIfAbsent("Улукбек Нурбекович Тогоев", phoneContact2);

        ArrayList<String> phoneContact3 = new ArrayList<>();
        phoneContact3.add("мобильный1 +7 733 924");
        phoneContact3.add("мобильный2 +7 926 924");
        phoneContact3.add("рабочий1 +7 924 063");
        phoneContact3.add("рабочий2 +7 268 934");
        phoneContact3.add("домашний1 +7 026 732");
        phoneContact3.add("домашний1 +7 145 863");
        phoneBook.putIfAbsent("Израиль Моисеевич Бланк", phoneContact3);

        System.out.println("Вся телефонная книга одним списком: ");
        for (HashMap.Entry<String, ArrayList<String>> item : phoneBook.entrySet()) {
            Object[] temp = item.getValue().toArray();
            for (Object phone : temp) {
                System.out.printf("Абонент %s телефон %s \n", item.getKey(), phone);

            }
        }

        System.out.println("\nВывод контактных данных абонента: ");
        for (HashMap.Entry<String,  ArrayList<String>> subscriber : phoneBook.entrySet()) {
            if (subscriber.getKey().equals("Улукбек Нурбекович Тогоев")) {
                Object[] temp = subscriber.getValue().toArray();
                for (Object phone : temp) {
                    System.out.printf("Абонент %s телефон %s \n", subscriber.getKey(), phone);
                }
            } 
        }

    }
}