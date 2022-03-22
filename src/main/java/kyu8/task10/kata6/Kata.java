package kyu8.task10.kata6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Kata {
  
  public static List filterList(final List list) {
      List<Object> ls = new ArrayList<>(list);
      return ls.stream().filter(obj -> obj.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
  }
}