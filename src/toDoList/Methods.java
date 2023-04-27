package toDoList;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Methods {
    public static void displayList(Collection<String> list) {
        System.out.println("Список задач на сегодня:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static Set<String> getUniqueStrings(List<String> strings) {
        return new HashSet<>(strings);
    }

    public static void displaySet(Collection<String> set) {
        System.out.println("Коллекция уникальных значений:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
