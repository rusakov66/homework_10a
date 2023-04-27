package toDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        List<String> toDoList = new ArrayList<>();

        toDoList.add("Купить продукты");
        toDoList.add("Купить продукты");
        toDoList.add("Купить продукты");
        toDoList.add("Купить продукты");
        toDoList.add("Позвонить другу");
        toDoList.add("Почитать книгу");
        toDoList.add("Сделать уборку");
        toDoList.add("Сделать уборку");
        toDoList.add("Сделать уборку");
        toDoList.add("Почитать книгу");

        Methods.displayList(toDoList);
        Set<String> uniqueStrings = Methods.getUniqueStrings(toDoList);
        Methods.displaySet(uniqueStrings);


    }
}
