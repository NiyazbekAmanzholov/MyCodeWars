package kyu8.task9.kata2;

import java.util.stream.*;
public class Kata {
  public static int[] mergeArrays(int[] first, int[] second) {
    return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
  }
}