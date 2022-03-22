package kyu8.task33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.of;

public class Sum {

  public static void main(String[] args) {
    System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
  }

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr1.length; i++) {
      list.add(arr1[i]);
    }

    for (int i = 0; i < arr2.length; i++) {
      list.add(arr2[i]);
    }

    return list.stream().mapToInt(Integer::intValue).sum();
  }
}

class Sum2 {
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return of(arr1).sum() + of(arr2).sum();
  }
}

class Sum3 {
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
  }
}

class Sum4 {
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return IntStream.concat(stream(arr1),stream(arr2)).sum();
  }
}

class Sum5 {
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum += arr1[i] + arr2[i];
    }
    return sum;
  }
}

class Sum6 {
  static int arrayPlusArray(int[] arr1, int[] arr2) {
    return of(arr1).sum() + of(arr2).sum();
  }
}