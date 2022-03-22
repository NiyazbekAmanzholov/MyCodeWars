package kyu8.task10.kata11;

import java.util.*;

public class Kata {
  
  public static List filterList(final List list) {
    List<Object> filtered = new ArrayList<>();
    for(Object nums : list)
      if(nums instanceof Integer) {
        filtered.add(nums);
      }
    return filtered;
  }
}