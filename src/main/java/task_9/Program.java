package task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("привет");
        list.add("пока");
        list.add("слово");
        list.add("нет");
        list.add("да");
        List<String> filterList =  list.stream().filter(str -> str.length() < 4).collect(Collectors.toList());
        System.out.println(filterList);
    }
}
