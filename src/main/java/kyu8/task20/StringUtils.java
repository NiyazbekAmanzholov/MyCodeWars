package kyu8.task20;

//    assertEquals("HELLO WORLD", StringUtils.toAlternativeString("hello world"));
//    assertEquals("hello world", StringUtils.toAlternativeString("HELLO WORLD"));
//    assertEquals("HELLO world", StringUtils.toAlternativeString("hello WORLD"));
//    assertEquals("hEllO wOrld", StringUtils.toAlternativeString("HeLLo WoRLD"));
//    assertEquals("Hello World", StringUtils.toAlternativeString(StringUtils.toAlternativeString("Hello World")));
//    assertEquals("12345", StringUtils.toAlternativeString("12345"));
//    assertEquals("1A2B3C4D5E", StringUtils.toAlternativeString("1a2b3c4d5e"));
//    assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", StringUtils.toAlternativeString("StringUtils.toAlternatingCase"));
//    assertEquals("ALTerNAtiNG CaSe", StringUtils.toAlternativeString("altERnaTIng cAsE"));
//    assertEquals("altERnaTIng cAsE", StringUtils.toAlternativeString("ALTerNAtiNG CaSe"));
//    assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", StringUtils.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
//    assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", StringUtils.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.Character.*;

public class StringUtils {

  public static void main(String[] args) {
    System.out.println(toAlternativeString("hello WORLD"));
  }
  
  public static String toAlternativeString(String string) {
    return Arrays.stream(string.split("")).map(a -> a.equals(a.toUpperCase()) ? a.toLowerCase() : a.toUpperCase())
            .collect(Collectors.joining());
  }
}

class StringUtils2 {
  public static String toAlternativeString(String string) {
    String result = "";
    for (char c : string.toCharArray()) {
      if(isUpperCase(c)) {
        result += toLowerCase(c);
      } else {
        result += toUpperCase(c);
      }
    }
    return result;
  }
}

class StringUtils3 {
  public static String toAlternativeString(String string) {
    return string.chars()
            .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
  }
}

class StringUtils4 {

  public static String toAlternativeString(String str){
    StringBuilder s = new StringBuilder();
    str.chars()
            .forEach( i -> {
              char c = (char) i;
              s.append( Character.isUpperCase(c) ? Character.toLowerCase(c)
                      : Character.toUpperCase(c));
            });
    return s.toString();
  }
}

class StringUtils5 {

  public static String toAlternativeString(String string) {
    return Arrays.stream(string.split(""))
            .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
            .collect(Collectors.joining(""));
  }
}

class StringUtils6 {

  public static String toAlternativeString(String string) {
    return string.chars()
            .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
  }
}

class StringUtils7 {

  public static String toAlternativeString(String string) {
    return string.chars()
            .map(ch -> Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch))
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
  }
}

class StringUtils8 {
  public static String toAlternativeString(String string) {
    char[] ch = string.toCharArray();
    for (int i = 0; i < ch.length; i++){
      if (Character.isUpperCase(ch[i])){
        ch[i] = Character.toLowerCase(ch[i]);
      }else if (Character.isLowerCase(ch[i])){
        ch[i] = Character.toUpperCase(ch[i]);
      }
    }
    return new String(ch);
  }
}

