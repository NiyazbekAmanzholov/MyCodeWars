package kyu8.task40;

//assertArrayEquals(new int[] {2, 4, 6}, Maps.map(new int[] {1, 2, 3}));

import java.util.Arrays;

public class Maps {
  public static int[] map(int[] arr) {
    return Arrays.stream(arr).map(a -> a * 2).toArray();
  }
}

class Maps2 {
  public static int[] map(int[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = inputArray[i]*2;
    }
    return inputArray;
  }
}

class Maps3 {
  public static int[] map(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 2;
    }
    return arr;
  }
}