package kyu8.task10.kata9;

import java.util.ArrayList;
import java.util.List;

public class Kata {

  public static List filterList(final List list) {
    ArrayList result = new ArrayList(list);
    result.removeIf(String.class::isInstance);
    return result;
  }

}