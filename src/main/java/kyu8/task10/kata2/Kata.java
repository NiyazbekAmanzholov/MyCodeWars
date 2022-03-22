package kyu8.task10.kata2;

import java.util.*;

public class Kata {
  public static List filterList(final List list) {
    return (List) list.stream().filter(o -> !o.getClass().equals(String.class)).collect(java.util.stream.Collectors.toList());
  }
}