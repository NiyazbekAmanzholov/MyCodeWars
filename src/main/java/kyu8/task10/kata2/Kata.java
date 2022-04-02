package kyu8.task10.kata2;

import java.util.*;
import java.util.stream.Collectors;

public class Kata {
  public static List filterList(final List list) {
    return (List) list.stream().filter(o -> !o.getClass().equals(String.class)).collect(Collectors.toList());
  }
}