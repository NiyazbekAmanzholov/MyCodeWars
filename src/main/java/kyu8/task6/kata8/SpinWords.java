package kyu8.task6.kata8;

import java.util.Arrays;

public class SpinWords {

  public static void main(String[] args) {
    SpinWords spinWords = new SpinWords();
    System.out.println(spinWords.spinWords("Hey wollef sroirraw"));
  }

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() >= 5 ? new StringBuilder(s).reverse().toString() : s)
                .reduce((s1, s2) -> s1 + " " + s2)
                .get();
  }
}