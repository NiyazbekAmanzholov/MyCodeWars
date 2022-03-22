package kyu8.task10.kata10;

import java.util.*;
import java.util.stream.Collectors;

public class Kata {
  
  public static List filterList(final List list) {
    return (List) list.stream()
                .filter(element -> !(element instanceof String))
                .collect(Collectors.toList());
  }
}