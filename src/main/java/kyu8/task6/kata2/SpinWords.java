package kyu8.task6.kata2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i < words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}

class SpinWords2 {
  public static void main(String[] args) {
    SpinWords spinWords = new SpinWords();
    System.out.println(spinWords.spinWords("Hey wollef sroirraw"));
  }

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
            .map(a -> a.length() >= 5 ? new StringBuilder(a).reverse() : a)
            .collect(Collectors.joining());
  }
}