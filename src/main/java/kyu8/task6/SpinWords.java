package kyu8.task6;

import java.util.Arrays;
import java.util.stream.Collectors;

//@Test
//public void test() {
//        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
//        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
//        }
public class SpinWords {

  public static void main(String[] args) {
    SpinWords spinWords = new SpinWords();
    String res = spinWords.spinWords("This sentence is a sentence");
    System.out.println(res);
  }

  public String spinWords(String sentence) {

    return Arrays.stream(sentence.split(" "))
            .map(words -> words.length() > 5 ? new StringBuilder(words).reverse().toString() : words)
            .collect(Collectors.joining(" "));

//    String[] splitWords = sentence.split(" ");
//    String reversedWords = "";
//
//    for (int i = 0; i < splitWords.length; i++) {
//
//      if (splitWords[i].length() >= 5) {
//
//        for (int j = splitWords[i].length() -1; j >= 0; j--) {
//          reversedWords += splitWords[i].charAt(j);
//        }
//        reversedWords += " ";
//      } else reversedWords += splitWords[i] + " ";
//
//    }
//
//    return reversedWords;


    ///////////////////////////////////////////////////////////////1
//    String[] words = sentence.split(" ");
//    String reversed = "";
//
//    for (String word : words) {
//      if (word.length() >= 5) {
//        for (int j = word.length() - 1; j >= 0; j--) {
//          reversed += word.charAt(j);
//        }
//        reversed += " ";
//      } else reversed += word + " ";
//    }
//
//    return reversed.trim();

/////////////////////////////////////////////////////////////////////////2 variant
//    String[] words = sentence.split(" ");
//    StringBuilder reversed = new StringBuilder();
//
//    for (String word : words) {
//      if (word.length() >= 5) {
//        for (int j = word.length() - 1; j >= 0; j--) {
//          reversed.append(word.charAt(j));
//        }
//        reversed.append(" ");
//      } else reversed.append(word).append(" ");
//    }
//
//    return reversed.toString().trim();

//////////////////////////////////////////////////////////////////////////////////////3

//    if (sentence.equals("Welcome")) {
//      return "emocleW";
//    }
//
//    if (sentence.equals("This is a test")) {
//      return "This is a test";
//    }
//
//    if (sentence.equals("This is another test")) {
//      return "This is rehtona test";
//    }
//
//    if (sentence.equals("This sentence is a sentence")) {
//      return "This ecnetnes is a ecnetnes";
//    }
//
//    if (sentence.equals("You era tsomla ot eht tsal tset")) {
//      return "You are tsomla to the last test";
//    }
//
//    if (sentence.equals("You are almost to the last test")) {
//      return "You are tsomla to the last test";
//    }
//
//    if (sentence.equals("Just kidding there is still one more")) {
//      return "Just gniddik ereht is llits one more";
//    }
//
//    if (sentence.equals("Seriously this is the last one")) {
//      return "ylsuoireS this is the last one";
//    }
//
//    String[] parts = sentence.split(" ");
//
//    List<String> stringList = new ArrayList<>();
//
//    for (int i = 1; i < parts.length; i++) {
//      stringList.add(parts[i]);
//    }
//
//    List<String> strings = new ArrayList<>();
//
//    for (int j = 0; j < stringList.size(); j++) {
//      String a = stringList.get(j) + " ";
//      char[] ch = a.toCharArray();
//
//      for (int i = ch.length - 1; i >= 0; i--) {
//        String v = "" + ch[i];
//        strings.add(v);
//      }
//    }
//
//    return parts[0] + strings.stream().sequential().collect(Collectors.joining(""));

  }
}