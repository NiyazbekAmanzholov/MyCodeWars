package kyu8.task24;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//         assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
//                 assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
//                 assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
//
public class ReverseWords{

 public static void main(String[] args) {
  System.out.println(reverseWords("I like eating"));
 }

 public static String reverseWords(String str){
   String[] arr = str.split(" ");
     String stroka = "";

     for (int i = arr.length-1; i >= 0; i--) {
         stroka += arr[i] + " ";
     }
     return stroka.trim();
 }
}

class ReverseWords2{
    public static String reverseWords(String str){
        List words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}

class ReverseWords3{
    public static String reverseWords(String str){
        return Arrays.stream(str.split(" ")).reduce((x, y) -> y+" "+x).get();
    }
}

class ReverseWords4{
    static String reverseWords(String str) {
        return Arrays.stream(str.split(" ")).reduce((x, y) -> y + " " + x).orElse("");
    }
}

class ReverseWords5 {
    public static String reverseWords(String str){
        String [] y = str.split(" ");
        Collections.reverse(Arrays.asList(y));
        return String.join(" ",y);
    }
}