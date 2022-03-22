package kyu8.task6.kata13;

import java.util.Arrays;
public class SpinWords {

  public String spinWords(String sentence) {
            return Arrays.stream(sentence.split(" "))
                    .map(m -> (m.length() >= 5) ? new StringBuilder(m).reverse().toString() : m)
                    .reduce( (w1, w2)-> w1 + " " + w2).get();
  }
}