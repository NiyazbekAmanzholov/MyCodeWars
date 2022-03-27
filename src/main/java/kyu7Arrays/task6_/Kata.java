package kyu7Arrays.task6_;
//Учитывая двумерный массив целых чисел, верните сплющенную версию массива со всеми целыми числами в
//        отсортированном (возрастающем) порядке.
//Учитывая [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], ваша функция должна возвращать [1, 2, 3, 4, 5, 6, 7, 8, 9].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Assert.assertArrayEquals(new int[]{}, Kata.flattenAndSort(new int[][]{}));
//Assert.assertArrayEquals(new int[]{1}, Kata.flattenAndSort(new int[][]{{}, {1}}));
//Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Kata.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
//Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100}, Kata.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}));
//Assert.assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, Kata.flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));
public class Kata {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(flattenAndSort(new int[][]{{}, {1}})));
  }

  public static int[] flattenAndSort(int[][] array) {

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < array.length; ++i) {
      for(int j = 0; j < array[i].length; ++j) {
        list.add(array[i][j]);
      }
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}