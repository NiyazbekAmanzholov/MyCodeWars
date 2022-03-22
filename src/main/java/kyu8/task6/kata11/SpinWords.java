package kyu8.task6.kata11;

import java.util.Arrays;
import java.util.stream.Collectors;
public class SpinWords {

  public String spinWords(String sentence) {
    String[] sentArray = sentence.split(" ");
    return Arrays.asList(sentArray).stream()
        .map(w -> w.length() < 5? w : new StringBuilder(w).reverse().toString())
        .collect(Collectors.joining(" "))
        .toString();
  }
}