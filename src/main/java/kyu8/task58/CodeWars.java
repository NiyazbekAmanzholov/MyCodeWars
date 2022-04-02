package kyu8.task58;

//        Создайте функцию, которая принимает 2 строковых аргумента и возвращает целое число от количества вхождений,
//        в которых 2-й аргумент найден в первом.
//        Если вхождения не найдены, должно быть возвращено значение 0.
//
//        ("Hello", "o")  ==>  1
//        ("Hello", "l")  ==>  2
//        ("", "z")       ==>  0

import java.util.Arrays;
import java.util.Collections;

public class CodeWars {

  public static void main(String[] args) {
    System.out.println(strCount("Hello", 'l'));
  }

  public static int strCount(String str, char letter) {
    return (int) Arrays.stream(str.split("")).filter(a -> a.equals(String.valueOf(letter))).count();
  }
}

class CodeWars2 {
  public static int strCount(String str, char letter) {
    return (int)str.chars().filter(x -> x == letter).count();
  }
}

class CodeWars3 {
  public static int strCount(String str, char letter) {
    return Collections.frequency(Arrays.asList(str.split("")), ""+letter);
  }
}

class CodeWars4 {
  public static int strCount(String str, char letter) {
    return str.length() - str.replace(String.valueOf(letter), "").length();
  }
}

class CodeWars5 {
  public static int strCount(String str, char letter) {

    return (int) str.codePoints()
            .mapToObj(c -> (char) c)
            .filter(c -> c.equals(letter))
            .count();
  }
}

class CodeWars6 {
  public static int strCount(String str, char letter) {
    return str.replaceAll("[^"+letter+"]","").length();
  }
}

class CodeWars7 {
  public static int strCount(String str, char letter) {
    return str.replaceAll(String.format("[^%s]", letter), "").length();
  }
}