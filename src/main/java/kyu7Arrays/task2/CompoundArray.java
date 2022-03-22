package kyu7Arrays.task2;

//Вы должны создать метод "compoundArray", который должен принимать в качестве входных данных два массива int разной
//длины и возвращать один массив int с номерами обоих массивов, перетасованными один за другим.
//Input - {1,2,3,4,5,6} and {9,8,7,6}
//Output - {1,9,2,8,3,7,4,6,5,6}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CompoundArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(CompoundArray.compoundArray(new int[]{1, 2, 3, 4, 5, 6}, new int[]{9, 8, 7, 6})));
    }
    
    public static int[] compoundArray(int[] a, int[] b) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length && i < b.length; i++) {
            list.add(a[i]);
            list.add(b[i]);
        }

        if (a.length < b.length) {
            for (int i = a.length; i < b.length; i++) {
                list.add(b[i]);
            }
        }

        for (int i = b.length; i < a.length; i++) {
            list.add(a[i]);
        }

    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

class CompoundArray2 {
    public static int[] compoundArray(int[] a, int[] b){
        return IntStream.range(0, Math.max(a.length, b.length))
                .flatMap( i -> i < a.length && i < b.length ?
                IntStream.of(a[i], b[i])
                : i < b.length ?
                IntStream.of(b[i])
                : IntStream.of(a[i]) )
                .toArray();
    }
}

class CompoundArray3 {
    public static int[] compoundArray(int[] a, int[] b){
        int res[] = new int[a.length+b.length];
        for (int i = 0,j = 0; j < res.length; i++) {
            if (i < a.length) res[j++] = a[i];
            if (i < b.length) res[j++] = b[i];
        }
        return res;
    }
}