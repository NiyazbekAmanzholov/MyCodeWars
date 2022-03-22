package kyu8.task16;

import java.util.Arrays;

public class Kata {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(Kata.between(-2, 2
    )));
  }

  public static int[] between(int a, int b) {
    int[] result = new int[b - a + 1];
    for (int i = a; i <= b; i++) {
      result[i - a] = i;
    }
    return result;
  }
}

class Kata2 {
  public static int[] between(int a, int b) {
    return java.util.stream.IntStream.rangeClosed(a, b).toArray();
  }
}

class Kata3 {

  public static int[] between(int a, int b) {
    int length = b-a+1;
    int[] result = new int[length];
    for (int i = 0; i < length; i++){
      result[i] = a;
      a++;
    }
    return result;
  }
}

class Kata4 {

  public static int[] between(int a, int b) {
    int[] numbersBetween = new int[(b-a) + 1];

    for(int i = 0 ; i < numbersBetween.length; i++) {
      numbersBetween[i] = a + i;
    }
    return numbersBetween;
  }
}

class Kata5 {

  public static int[] between(int a, int b) {
    int[] ret = new int[b-a+1];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = a;
      a++;
    }
    return ret;
  }
}