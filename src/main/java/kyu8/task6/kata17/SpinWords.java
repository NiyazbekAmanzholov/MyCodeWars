package kyu8.task6.kata17;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {

  public String spinWords(String sentence) {
    return Stream.of(sentence.split(" ")).map(s -> s.length() > 4 ? new StringBuilder(s).reverse() : s)
            .collect(Collectors.joining(" "));
  }
}