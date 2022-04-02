package kyu8.task55;

//Создайте функцию, которая принимает строку и целое число (n).
//        Функция должна возвращать строку, которая повторяет входную строку nнесколько раз.
//        Если что-то, кроме строки, передается, вы должны вернуть "Not a string"
//        Пример
//        "Hi", 2 --> "HiHi"
//        1234, 5 --> "Not a string"

//   repeatTest("*", 3, "***");

//repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");

//final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
//        assertEquals(testMessage,  expected, RepeatIt.repeatString(toRepeat, n));

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class RepeatIt {
  public static void main(String[] args) {
    System.out.println(repeatString("Hi", 2));
  }

  public static String repeatString(final Object toRepeat, final int n) {

    StringBuilder res = new StringBuilder();

      if (toRepeat instanceof String) {
        for (int i = 0; i < n; i++) {
          res.append(toRepeat);
        }
      } else return "Not a string";
      return res.toString();
  }
}

class RepeatIt2 {
  public static void main(String[] args) {
    System.out.println(repeatString("Hi", 2));
  }

  public static String repeatString(final Object toRepeat, final int n) {
    StringBuilder res = new StringBuilder();
    if (toRepeat instanceof String) for (int i = 0; i < n; i++) res.append(toRepeat); else return "Not a string";
    return res.toString();
  }
}

class RepeatIt3 {

  public static void main(String[] args) {
    System.out.println(repeatString("Hi", 2));
  }

  static String repeatString(Object toRepeat, int n) {
    if (!(toRepeat instanceof String)) return "Not a string";

    return IntStream.rangeClosed(1, n)
            .mapToObj(i -> toRepeat.toString())
            .collect(Collectors.joining(""));
  }
}

class RepeatIt4 {

  public static void main(String[] args) {
    System.out.println(repeatString("Hi", 2));
  }

  static String repeatString(Object toRepeat, int n) {
    return toRepeat instanceof String ? IntStream.rangeClosed(1, n)
            .mapToObj(i -> toRepeat.toString())
            .collect(Collectors.joining("")) : "Not a string";
  }
}