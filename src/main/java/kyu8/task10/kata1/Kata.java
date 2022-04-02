package kyu8.task10.kata1;

import java.util.*;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }

  public static List filterList(final List list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}

class Kata2 {
    public static void main(String[] args) {
        System.out.println(filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }

    public static List filterList(final List list) {
        return (List) list.stream().filter(a -> a instanceof Number).distinct().collect(Collectors.toList());
    }
}