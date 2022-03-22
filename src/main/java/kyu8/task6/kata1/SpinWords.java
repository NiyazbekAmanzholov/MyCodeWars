package kyu8.task6.kata1;

import java.util.stream.*;
import java.util.Arrays;

public class SpinWords {

  public static void main(String[] args) {
    SpinWords spinWords = new SpinWords();

    System.out.println(spinWords.spinWords("Hey wollef sroirraw"));
  }

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }
}