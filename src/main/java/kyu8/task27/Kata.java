package kyu8.task27;
//Преобразование числа в обратный массив цифр
//        Учитывая случайное неотрицательное число, вы должны вернуть цифры этого числа в массив в обратном порядке.
//
//        Пример:
//        348597 => [7,9,5,8,4,3]
//        0 => [0]

//    assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
//            assertArrayEquals(new int[] {0}, Kata.digitize(0));

import java.util.*;

public class Kata {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(Kata.digitize(35231)));
  }

  public static int[] digitize(long n) {

    Long.toString(n).split("");

    int[] mass = Arrays.stream(Long.toString(n).split("")).mapToInt(Integer::parseInt)
            .toArray();

    List<Integer> integerList = new ArrayList<>();

    for (int i = 0; i < mass.length; i++) {
      integerList.add(mass[i]);
    }

    Collections.reverse(integerList);

    return integerList.stream().mapToInt(Integer::intValue).toArray();
  }
}

class A {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(A.digitize(35231)));
  }

  public static int[] digitize(long n) {
  StringBuilder stringBuilder = new StringBuilder();
  return stringBuilder.append(n).reverse().chars().map(Character::getNumericValue).toArray();
  }
}

class Kata2 {
  public static int[] digitize(long n) {
    String s = String.valueOf(n);
    int length = s.length();
    int[] array = new int[length];
    for ( int i = 0; i < length; i++){
      array[i] = (int) (s.charAt(length - i - 1)) - 48;
    }
    return array;
  }
}

class Kata3 {
  static int[] digitize(long n) {
    return new StringBuilder(String.valueOf(n))
            .reverse()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
  }
}