package kyu8.task9.kata3;

import java.util.TreeSet;

public class Kata {
  public static int[] mergeArrays(int[] first, int[] second) {
    TreeSet<Integer> set = new TreeSet<>();
        
    for (int x : first) set.add(x);
    for (int x : second) set.add(x);

    return set.stream().mapToInt(Integer::intValue).toArray();
  }
}