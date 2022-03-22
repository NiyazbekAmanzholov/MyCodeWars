package kyu8.task10.kata4;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Kata {  
  public static List filterList(final List<?> list) {
    return list.stream()
                .filter(o -> o instanceof Number)
                .collect(toList());
  }
}