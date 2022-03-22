package kyu8.task23;

import java.util.Arrays;
import java.util.stream.Collectors;

//Напишите функцию для преобразования имени в инициалы. Это ката строго принимает два слова с одним пробелом между ними.
//Вывод должен состоять из двух заглавных букв с точкой, разделяющей их.
//Это должно выглядеть так:
//Sam Harris => S.H
//patrick feeney => P.F

//assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
//assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
//assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
//assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
//assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
public class AbbreviateTwoWords {

  public static void main(String[] args) {
    System.out.println(abbrevName("g c"));
  }

  public static String abbrevName(String name) {
    return Arrays.stream(name.split(" "))
            .map(a -> a.substring(0, 1).toUpperCase())
            .collect(Collectors.joining("."));

//  public static String abbrevName(String name) {
//
//    return Arrays.stream(name.split("")).map(a -> a.equals(a.toUpperCase()) ? a.toUpperCase() : "")
//            .collect(Collectors.joining()).replaceAll(" ", ".");
  }
}

class AbbreviateTwoWords2 {
  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
}

class AbbreviateTwoWords3 {
  public static String abbrevName(String name) {
    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
  }
}

class AbbreviateTwoWords4 {
  public static String abbrevName(String name) {
    String[] init = name.split(" ");
    return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
  }
}

class AbbreviateTwoWords5 {
  public static String abbrevName(String name) {
    name = name.toUpperCase();
    return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
  }
}

class AbbreviateTwoWords6 {
  public static String abbrevName(String name) {
    return Arrays.stream(name.split(" "))
            .map(String::toUpperCase)
            .map(word -> word.substring(0, 1))
            .collect(Collectors.joining("."));
  }
}

class AbbreviateTwoWords7 {
  public static String abbrevName(String name) {
    return Arrays.stream(name.split(" "))
            .map(e -> String.valueOf(e.charAt(0)).toUpperCase())
            .collect(Collectors.joining("."));
  }
}

class AbbreviateTwoWords8 {
  public static String abbrevName(String name) {
    return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
  }
}

class AbbreviateTwoWords9 {
  public static String abbrevName(String name) {
    String[] words = name.toUpperCase().split(" ");
    return new StringBuilder().append(words[0].charAt(0)).append(".").append(words[1].charAt(0)).toString();
  }
}