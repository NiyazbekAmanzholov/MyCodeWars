package kyu8.task9.kata1;

import java.util.Arrays;

import static java.util.stream.IntStream.*;

public class Kata {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(mergeArrays(new int[]{2, 4, 8}, new int[]{2, 4, 6})));
  }

  public static int[] mergeArrays(int[] first, int[] second) {
    return concat(of(first), of(second)).sorted().distinct().toArray();
  }
}