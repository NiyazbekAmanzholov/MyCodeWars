package kyu8.task42;
//На каждую хорошую идею ката приходится немало плохих!
// В этом ката вам нужно проверить предоставленный массив (x) на наличие хороших идей "good" и плохих идей "bad".
// Если есть одна или две хорошие идеи, верните " Опубликовать!", если их больше 2, верните "Я чую серию!". Если нет хороших идей,
// как это часто бывает, верните "Fail!".

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

//assertEquals("Fail!", Kata.well(new String[] {"bad", "bad", "bad"}));
//assertEquals("Publish!", Kata.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
//assertEquals("I smell a series!", Kata.well(new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
public class Kata {

  public static void main(String[] args) {
    System.out.println(Kata.well(new String[] {"", "", "", "bad", "bad", "bad"}));
  }

  public static String well(String[] x) {
    return Arrays.stream(x).filter(a -> a.equals("good")).count() > 2 ? "I smell a series!" : Arrays.stream(x)
            .filter(a -> a.equals("good")).count() > 0 ? "Publish!" : "Fail!";
  }
}

class Kata2 {

  public static void main(String[] args) {
    System.out.println(Kata.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
  }

  public static String well(String[] x) {
    return Arrays.stream(x).filter(a -> a.equals("good")).count() > 2 ? "I smell a series!" : Arrays.asList(x).contains("good") ? "Publish!" : "Fail!";
  }
}

class Kata3 {
  public static String well(String[] x) {
    int count = 0;
    for (String s : x) {
      if (s.equals("good")) count++;
      if (count > 2) return "I smell a series!";
    }
    if (count != 0) return "Publish!";
    return "Fail!";
  }
}

class Kata4 {
  public static String well(String[] x) {
    switch (Collections.frequency(Arrays.asList(x), "good")) {
      case 1:
      case 2:
        return "Publish!";
      case 0:
        return "Fail!";
      default:
        return "I smell a series!";
    }
  }
}

class Kata5 {
  static String well(String[] ideas) {
    long count = Arrays.stream(ideas).filter(i -> i.equals("good")).count();
    return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
  }
}

class Kata6 {
  public static String well(String[] x) {
    int goodCount = (String.join(" ", x).length() - String.join(" ", x).replace("good", "").length())/4;
    return goodCount > 2 ? "I smell a series!" : goodCount == 0 ? "Fail!" : "Publish!";
  }

}