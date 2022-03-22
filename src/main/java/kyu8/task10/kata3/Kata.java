package kyu8.task10.kata3;

import java.util.*;
import java.util.stream.*;

public class Kata {
  
  public static List filterList(final List list) {
    return (List<Object>) list.stream().filter( e -> e instanceof Integer ).collect(Collectors.toList());
  }
}