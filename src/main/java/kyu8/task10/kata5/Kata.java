package kyu8.task10.kata5;

import java.util.*;
import java.util.stream.Collectors;

public class Kata {
  
  public static List filterList(final List list) {
    return (List)list.stream().filter(e -> ! (e instanceof String)).collect(Collectors.toList());   
  }
}