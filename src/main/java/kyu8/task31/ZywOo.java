package kyu8.task31;

import java.util.*;
import java.util.stream.IntStream;

class ZywOo {

  public static void main(String[] args) {
    System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
  }

  public static int sumOfDifferences(int[] arr) {
    return arr.length > 0 ? Arrays.stream(arr).summaryStatistics().getMax()
            - Arrays.stream(arr).summaryStatistics().getMin() : 0;
  }
}

class ZywOo2 {
  public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr);
    return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
  }
}

class ZywOo3 {
  public static int sumOfDifferences(int[] arr) {
    if (arr.length < 2) {
      return 0;
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }

      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return max - min;
  }
}

class ZywOo4 {
  public static int sumOfDifferences(int[] arr) {
    IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
    return arr.length > 1 ? stat.getMax() - stat.getMin() : 0;
  }
}

class ZywOo5 {
  public static void main(String[] args) {
    System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
  }

  public static int sumOfDifferences(int[] arr) {
    int[] array = IntStream.of(arr)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();

    return IntStream.range(0, array.length - 1)
            .map(i -> array[i] - array[i + 1])
            .sum();
  }
}

class ZywOo6 {
  public static int sumOfDifferences(int[] arr) {
    if(arr.length < 2) return 0;

    int min = Integer.MAX_VALUE,
            max = Integer.MIN_VALUE;

    for(int i: arr) {
      if(i < min) min = i;
      if(i > max) max = i;
    }

    return max - min;
  }
}

class ZywOo7 {
  public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr);
    int result = 0;
    int kek = 0;
    for (int i = arr.length - 1; i > 0; i--){
      result += (arr[i] - arr[i - 1]);
    }
    return result;
  }
}

class ZywOo8 {

  public static int sumOfDifferences(int[] arr) {
    if (arr.length < 2) {
      return 0;
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }

      if (arr[i] < min) {
        min = arr[i];
      }
    }

    return max - min;
  }
}