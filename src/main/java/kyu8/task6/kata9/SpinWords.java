package kyu8.task6.kata9;

import java.util.*;
import java.lang.*;
public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
        .map(s -> s.length()>4 ? new StringBuffer(s).reverse().toString():s)
        .reduce((a, b) -> a + " " + b).get();
  }
}