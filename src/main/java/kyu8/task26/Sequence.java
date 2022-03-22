package kyu8.task26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Постройте функцию, которая возвращает массив целых чисел от n до 1, где n>0.
//Пример : n=5--> [5,4,3,2,1]
//assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
public class Sequence{
  public static void main(String[] args) {
    System.out.println(Arrays.toString(reverse(5)));
  }

  public static int[] reverse(int n){
    List<Integer> list = new ArrayList<>();
    for (int i = n; i > 0 ; i--) {
        list.add(i);
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}

class Sequence2 {
  public static int[] reverse(int n){
    int[] res = new int[n];
    for (int i=0; i<n; i++)
      res[i]=n-i;
    return res;
  }
}

class Sequence3 {

  public static int[] reverse(int n){
    return IntStream.range(-n, 0).map(Math::abs).toArray();
  }
}

class Sequence4 {

  public static int[] reverse(int n){
    return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
  }
}

class Sequence5 {

  public static int[] reverse(int n){
    int[] result = new int[n];
    for(int i=n;i>0;i--){
      result[n-i]=i;
    }
    return result;
  }
}