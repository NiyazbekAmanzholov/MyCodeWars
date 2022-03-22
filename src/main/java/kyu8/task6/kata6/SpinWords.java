package kyu8.task6.kata6;

import java.util.*;
import java.util.stream.Collectors;

public class SpinWords {

  public String spinWords(String sentence) {
      
      return Arrays.stream( sentence.split(" ") )
                   .map( w -> w.length() < 5 ? w : new StringBuilder(w).reverse().toString() )
                   .collect(Collectors.joining(" "));
  }
}