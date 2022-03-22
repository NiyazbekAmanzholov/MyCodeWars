package kyu8.task6.kata5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                .map(str -> str.length()>4?new StringBuffer(str).reverse().toString():str)
                .collect(Collectors.joining(" "));
  }
}