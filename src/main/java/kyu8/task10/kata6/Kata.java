package kyu8.task10.kata6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Kata {
  public static void main(String[] args) {
     System.out.println(filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));
  }

  public static List filterList(final List list) {
      return (List) list.stream().filter(obj -> obj.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
  }
}