package kyu8.task10.kata8;

import java.util.*;

public class Kata {
  
  public static List filterList(final List list) {
    ArrayList<Integer> res = new ArrayList<>();
    
    for(int i=0; i<list.size(); i++){
      Object ob = list.get(i);
      if(ob.getClass().getName().equals(Integer.class.getName())){
        res.add((Integer)ob);
      }
    }
      
    return res;
  }
}