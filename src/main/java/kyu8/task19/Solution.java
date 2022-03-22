package kyu8.task19;
import java.util.Arrays;
import java.util.stream.Collectors;

//Учитывая строку, вы должны вернуть строку, в которой каждый символ (чувствительный к регистру) повторяется один раз.
//
//        Примеры (Ввод -> Вывод):
//        * "String"      -> "SSttrriinngg"
//        * "Hello World" -> "HHeelllloo  WWoorrlldd"
//        * "1234!_ "     -> "11223344!!__  "

//       assertEquals("SSttrriinngg",Solution.doubleChar("String"));
//               assertEquals("HHeelllloo  WWoorrlldd",Solution.doubleChar("Hello World"));
//               assertEquals("11223344!!__  ",Solution.doubleChar("1234!_ "));
public class Solution{

  public static void main(String[] args) {
    System.out.println(Solution.doubleChar("Hello World"));
  }

  public static String doubleChar(String s){
     return Arrays.stream(s.split("")).map(a -> a + a).collect(Collectors.joining());
  }
}

class Solution2 {
  public static String doubleChar(String s) {
    StringBuilder result = new StringBuilder();
    s.chars().forEach(character -> result.append((char) character).append((char) character));
    return result.toString();
  }
}

class Solution3 {
  public static String doubleChar(String s){
    return s=s.replaceAll(".", "$0$0");
  }
}

class Solution4 {
  public static String doubleChar(String s){
    StringBuilder srtingBuilder = new StringBuilder("");
    for (int i = 0; i < s.length(); i++) {
      srtingBuilder.append(s.charAt(i)).append(s.charAt(i));
    }
    return srtingBuilder.toString();
  }
}