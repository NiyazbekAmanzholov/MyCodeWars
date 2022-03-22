package kyu8.task6.kata10;

import java.util.*;
import java.util.stream.*;

public class SpinWords {

  public String spinWords(String sentence) {
      return String.join(" ", Arrays.stream(sentence.split(" ")).map(str -> str.length()>4 ? new StringBuffer(str).reverse().toString() : str).collect(Collectors.toList()));
  }
}