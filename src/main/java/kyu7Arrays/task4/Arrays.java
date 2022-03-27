package kyu7Arrays.task4;

//Напишите функцию, которая может возвращать наименьшее значение массива или индекс этого значения. 2-й параметр функции скажет, должен ли он
// возвращать значение или индекс.
//        Предположим, что первым параметром всегда будет массив, заполненный как минимум 1 числом и без дубликатов. Предположим, что вторым
//        параметром будет строка, содержащая одно из двух значений: "value" и "index".

//        Arrays.findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
//        Arrays.findSmallest(new int[]{1,2,3,4,5}, 'index') // =>

//assertEquals( "The smallest index" , 0 , Arrays.findSmallest( new int [] {1, 2, 3} , "index") );
//assertEquals( "The smallest value" , 2 , Arrays.findSmallest( new int [] {7, 12, 3, 2, 27} , "value") );
//assertEquals( "The smallest index" , 3 , Arrays.findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Array {

    public static void main(String[] args) {
        System.out.println(Array.findSmallest(new int [] {7, 12, 3, 2, 27} , "index"));
    }

  public static int findSmallest( final int[] numbers, final String toReturn ) {
    return toReturn.equals("value") ? Arrays.stream(numbers).min().getAsInt() : IntStream.range(0, numbers.length)
            .filter(i -> numbers[i] == Arrays.stream(numbers).min().getAsInt()).toArray()[0];
	}
}

//class Array {
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.findSmallest(new int [] {7, 12, 3, 2, 27} , "index"));
//    }
//
//    public static int findSmallest( final int[] numbers, final String toReturn ) {
//        return toReturn.equals("value") ?
//                java.util.Arrays.stream(numbers).min().getAsInt()
//                : IntStream.range(0, numbers.length).filter(i -> numbers[i] ==
//                java.util.Arrays.stream(numbers).min().getAsInt()).toArray()[0];
//    }
//}

class Arrays1 {

    public static int findSmallest( final int[] numbers, final String toReturn ) {
        OptionalInt minimun = IntStream.of(numbers).min();
        return "value".equals(toReturn)?minimun.getAsInt() :IntStream.of(numbers).boxed().collect(toList()).indexOf(minimun.getAsInt());

    }
}

class Arrays2 {

    public static int findSmallest( final int[] numbers, final String toReturn ) {
        int lowest = 0;
        for (int i = 1; i < numbers.length; ++i)
            if (numbers[i] < numbers[lowest]) lowest = i;
        return (toReturn == "index") ? lowest : numbers[lowest];
    }
}

class Arrays3 {

    public static int findSmallest( final int[] numbers, final String toReturn ) {

        int smallestIdx = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[smallestIdx]) {
                smallestIdx = i;
            }
        }
        return "index".equals(toReturn) ? smallestIdx : numbers[smallestIdx];
    }
}

class Arrays4 {

    public static int findSmallest( final int[] numbers, final String toReturn ) {
        int ind = IntStream.range(0, numbers.length).boxed().min(Comparator.comparingInt(i -> numbers[i] )).get();
        return toReturn.equals("value") ? numbers[ind] : ind;
    }
}