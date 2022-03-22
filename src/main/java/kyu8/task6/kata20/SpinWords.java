package kyu8.task6.kata20;

public class SpinWords {
  public String spinWords(String sentence) {

    String[] array = sentence.split(" ");
    String result = "";
    String reversed = "";
    for(String word : array) {
      if(word.length() >= 5) {
        for(int i = word.length() - 1;i >= 0;i--) {
          reversed += word.charAt(i);
        } 
        result += reversed + " ";
        reversed = "";
      } else result += word + " ";
    }
    return result.trim();
  }
}