package kyu8.task6.kata18;

import java.util.stream.Stream ;
import java.util.stream.Collectors;

public class SpinWords {

  public String spinWords(String sentence) {
    //TODO: Code stuff here
    String result = Stream.of(sentence.split(" ")).map(item -> {
      if(item.length() >= 5) {
        StringBuilder sb = new StringBuilder();
        sb = sb.append(item).reverse();
        return sb.toString();
      } else {
        return item;
      }
    }).collect(Collectors.toList()).stream().map(item -> item.toString()+ " ").reduce("", String::concat);

    return result.trim();
  }
}