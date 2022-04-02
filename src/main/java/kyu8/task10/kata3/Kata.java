package kyu8.task10.kata3;

import java.util.*;
import java.util.stream.*;

public class Kata {

  public static void main(String[] args) {
    System.out.println(filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));
  }
  
  public static List filterList(final List list) {
    return (List<Object>) list.stream().filter( e -> e instanceof Integer ).collect(Collectors.toList());
  }
}