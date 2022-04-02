package kyu8.task61;

//Ваша задача-найти первый элемент массива, который не является последовательным.
//Под не последовательным мы подразумеваем не совсем 1 больше,чем предыдущий элемент массива.
//Например, если у нас есть массив[1,2,3,4,6,7,8]1, то 2тогда 34все они последовательны, но 6нет,
//так что это первое непоследовательное число.
//Если весь массив является последовательным,то возвращает null2.
//Массив всегда будет иметь по крайней мере 2элементы1,и все элементы будут числами.
//Все числа также будут уникальными и в порядке возрастания. Числа могут быть положительными или отрицательными,
//и первое непоследовательное число тоже может быть!
//Если вам нравится это Ката, может быть, попробуйте следующее: https://www.codewars.com/kata/represent-array-of-numbers-as-ranges
//1 Можете ли вы написать решение,которое вернет null2 для обоих []и [ x ]хотя?
//(Это пустой массив и один с одним числом и не тестируется, но вы можете написать свой собственный пример теста.)

//assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
//assertEquals(null, FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
//assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
//assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
//assertEquals(null, FirstNonConsecutive.find(new int[]{31, 32}));
//assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
//assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));

import java.util.stream.IntStream;

class FirstNonConsecutive {
    public static void main(String[] args) {
        System.out.println(find(new int[] {31, 32}));
    }

    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; ++i) {
            if(array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }
        return null;
    }
}

class FirstNonConsecutive2 {
    public static void main(String[] args) {
        System.out.println(find(new int[] {1, 2, 3, 4, 6, 7, 8}));
    }

    static Integer find(final int[] array) {
        return IntStream.range(1, array.length)
                .filter(i -> array[i] - array[i - 1] != 1)
                .mapToObj(a -> array[a])
                .findFirst().orElse(null);
    }
}
class FirstNonConsecutive3 {
    static Integer find(final int[] array) {
        return IntStream
                .range(1, array.length)
                .filter(x -> array[x - 1] + 1 != array[x])
                .mapToObj(x -> array[x])
                .findFirst()
                .orElse(null);
    }
}

class FirstNonConsecutive4 {
    static Integer find(final int[] array) {
        for(int i = 0;i<array.length-1;i++){
            int sub = array[i+1] - array[i];
            if(sub != 1)
                return array[i+1];
        }
        return null;
    }
}
