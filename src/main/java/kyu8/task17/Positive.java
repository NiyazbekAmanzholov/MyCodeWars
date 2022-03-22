package kyu8.task17;
//Вы получаете массив чисел, возвращаете сумму всех положительных.
//        Пример [1,-4,7,12]=> 1 + 7 + 12 = 20
//        Примечание: если нет ничего, чтобы суммировать, сумма по умолчанию 0.

//        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
//                assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
//                assertEquals(0, Positive.sum(new int[]{}));
//                assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
//                assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));

import java.util.Arrays;

public class Positive{

  public static void main(String[] args) {
    System.out.println(sum(new int[]{1,-2,3,4,5}));
  }

  public static int sum(int[] arr){
    return Arrays.stream(arr).filter(a -> a > 0).sum();
  }
}

class Kata {
  public static int sum(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        res += arr[i];
      }
    }
    return res;
  }
}

class Positive2{
  public static int sum(int[] arr){
    int result = 0;
    for (int i : arr) {
      if (i > 0) {
        result += i;
      }
    }
    return result;
  }
}

class Positive3 {

  public static void main(String[] args) {
    System.out.println(sum(new int[]{1,-2,3,4,5}));
  }

  public static int sum(int[] arr){
    int sum = 0;

    for(int num : arr) sum += Math.max(num, 0);
    return sum;
  }
}

class Positive4 {

  public static int sum(int[] arr){
    int sum = 0;

    for(int num : arr) sum += num > 0 ? num : 0;
    return sum;
  }

}

class Positive5{
  public static int sum(int[] arr){
    return Arrays.stream(arr).filter(e -> e > 0).reduce(Integer::sum).orElse(0);
  }
}