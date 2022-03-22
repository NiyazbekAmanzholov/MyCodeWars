package kyu8.task10;
//Kata.filterList(Arrays.asList(1, 2, "a", "b")) => Arrays.asList(1,2)
//        Kata.filterList(Arrays.asList(1, 2, "a", "b", 0, 15)) => Arrays.asList(1,2,0,15)
//        Kata.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)) => Arrays.asList(1, 2, 231)
import java.util.*;
import java.util.stream.Collectors;

public class Kata {
  public static void main(String[] args) {
    System.out.println(filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));
  }

  public static List filterList(final List<Object> list) {
    return list.stream()
            .filter(e -> e instanceof Integer)
            .collect(Collectors.toList());
  }
}