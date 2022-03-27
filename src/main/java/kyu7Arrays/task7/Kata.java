package kyu7Arrays.task7;
//Ваша цель в этом ката-реализовать разностную функцию, которая вычитает один список из другого и вернет результат.
//        Он должен удалить все значения из списка a, которые присутствуют в спискеb, сохраняя их порядок.
//        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//        Если значение присутствует в b, все его вхождения должны быть удалены из другого:
//        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

//      assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
//              assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {1}));
//              assertArrayEquals(new int[] {1}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {2}));
//              assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {}));
//              assertArrayEquals(new int[] {}, Kata.arrayDiff(new int [] {}, new int[] {1,2}));

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toSet;

//class Kata {
//
//  public static void main(String[] args) {
//    System.out.println(Arrays.toString(Kata.arrayDiff(new int[]{}, new int[]{1, 2})));
//  }
//
//  public static int[] arrayDiff(int[] a, int[] b) {
//    return b.length <= 0 || a.length <= 0 ? a : Arrays.stream(a).filter(n -> n != b[0]).toArray();
//  }
//}

class Kata {
  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
    List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
    listA.removeAll(listB);
    return listA.stream().mapToInt(e -> e).toArray();
  }
}
class Kata2 {
  public static int[] arrayDiff(int[] a, int[] b) {
    return IntStream.of(a).filter(x -> IntStream.of(b).anyMatch(y -> y == x)).toArray();
  }
}

class Kata3 {
  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    loop:
    for (int num : a) {
      for (int i : b) if (num == i) continue loop;
      list.add(num);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}

class Kata4 {
  public static int[] arrayDiff(int[] a, int[] b) {
    if(a == null || b == null) return a;
    return Arrays.stream(a)
            .filter(elemA -> Arrays.stream(b).noneMatch(elemB -> Objects.equals(elemA,elemB)))
            .toArray();
  }
}

class Kata5 {
  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> b1 = Arrays.stream(b).boxed().collect(Collectors.toList());
    return Arrays.stream(a).filter(i -> !b1.contains(i)).toArray();
  }
}

class Kata6 {
  public static int[] arrayDiff(int[] a, int[] b) {
    if (a.length == 0) return new int[]{};
    else if (b.length == 0) return a;
    int r = 0;
    int[] result = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      boolean flag = true;
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          flag = false;
          break;
        }
      }
      if (flag) {
        result[r] = a[i];
        r++;
      }
    }
    return Arrays.copyOf(result, r);
  }
}

class Kata7 {
  public static int[] arrayDiff(int[] a, int[] b) {
    Set<Integer> bs = Arrays.stream(b).boxed().collect(toSet());
    return Arrays.stream(a).filter(i -> !bs.contains(i)).toArray();
  }
}

class Kata8 {
  public static int[] arrayDiff(int[] a, int[] b) {
    Set<Integer> bSet = Arrays.stream(b)
            .boxed()
            .collect(Collectors.toSet());

    return Arrays.stream(a)
            .filter(aElement -> !bSet.contains(aElement))
            .toArray();
  }
}