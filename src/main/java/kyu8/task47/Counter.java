package kyu8.task47;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

//Рассмотрим массив/список овец, где некоторые овцы могут отсутствовать на своем месте. Нам нужна функция,
//которая подсчитывает количество овец, присутствующих в массиве (true означает present).
//
//public class CounterTest {
//  Boolean[] array1 = {true,  true,  true,  false,
//          true,  true,  true,  true ,
//          true,  false, true,  false,
//          true,  false, false, true ,
//          true,  true,  true,  true ,
//          false, false, true,  true };
//
//  @Test
//  public void test() {
//    assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
//  }
//}
public class Counter {

    static Boolean[] array1 = {true,  true,  true,  false,
          true,  true,  true,  true ,
          true,  false, true,  false,
          true,  false, false, true ,
          true,  true,  true,  true ,
          false, false, true,  true };

  public static void main(String[] args) {
    System.out.println(new Counter().countSheeps(array1));
  }

  public int countSheeps(Boolean[] arrayOfSheeps) throws NullPointerException {
    return Math.toIntExact(Arrays.stream(arrayOfSheeps).filter(a -> a).count());
  }
}

class Counter2 {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    for (Boolean present : arrayOfSheeps) {
      if (present != null && present) {
        counter += 1;
      }
    }
    return counter;
  }
}

class Counter3 {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}

class Counte4r {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x == true).toArray().length;
  }
}

class Counter5 {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Math.toIntExact(Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(x -> x).count());
  }
}

class Counter6 {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return (int)Arrays.stream(arrayOfSheeps)
            .filter(Objects::nonNull)
            .filter(Boolean::booleanValue).count();
  }
}