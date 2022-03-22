package kyu8.task10.kata7;

import java.util.*;

public class Kata {
  
  public static List filterList(final List list) {
    List<Integer> re = new ArrayList<Integer>();
    // Return the List with the Strings filtered out
    for(Iterator iterator = list.iterator();iterator.hasNext();){
      Object o = iterator.next();
      if( o instanceof Integer){
        re.add((Integer)o);
      }
    }
    return re;
  }
}