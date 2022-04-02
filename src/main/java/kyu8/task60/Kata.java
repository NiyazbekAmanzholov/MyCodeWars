package kyu8.task60;
//Учитывая неотрицательное целое число, 3например, верните строку с шепотом: "1 sheep...2 sheep...3 sheep...".
//Ввод всегда будет действительным, т. Е. Никаких отрицательных целых чисел.

//assertEquals("", Kata.countingSheep(0));
//assertEquals("1 sheep...", Kata.countingSheep(1));
//assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
//assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {

  public static void main(String[] args) {
    System.out.println(countingSheep(2));
  }

  public static String countingSheep(int num) {
    String str = "";

    for (int i = 0; i < num; i++) {
      str += i+1 + " sheep...";
    }
    return str;
  }
}
class Kata2 {

  public static void main(String[] args) {
    System.out.println(countingSheep(2));
  }

  public static String countingSheep(int num) {
    String str = "";
    for (int i = 0; i < num; i++) str += i+1 + " sheep...";
    return str;
  }
}

class Kata3 {
  public static String countingSheep(int num) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      stringBuilder.append(i).append(" sheep...");
    }
    return stringBuilder.toString();
  }
}

class Kata4 {
  public static String countingSheep(int num) {
    return IntStream.rangeClosed(1, num)
            .mapToObj(i -> i + " sheep...")
            .collect(Collectors.joining());
  }
}
