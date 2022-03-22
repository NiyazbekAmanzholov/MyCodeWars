package kyu8.task6.kata12;

import java.util.*;
import java.util.stream.Collectors;

public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.asList(sentence.split("\\s+")).stream()
           .map(w->w.length()>4?new StringBuilder(w).reverse():w)
           .collect(Collectors.joining( " " ));
  }
}