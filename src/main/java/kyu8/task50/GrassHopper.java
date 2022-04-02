package kyu8.task50;

//Найти среднее значение
//        Найти среднее (среднее) из списка чисел в массиве.
//        Информация
//        Чтобы найти среднее значение (среднее значение) набора чисел, сложите все числа вместе и разделите на количество значений в списке.
//        Для примера список 1, 3, 5, 7
//        1. Сложите все числа
//        1+3+5+7 = 16
//        2. Разделить на количество значений в списке. В этом примере в списке есть 4 числа.
//
//        16/4 = 4
//        3. The mean (or average) of this list is 4

//    assertEquals(1,GrassHopper.findAverage(new int[]{1}));
//    assertEquals(4,GrassHopper.findAverage(new int[]{1,3,5,7}));

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.of;

public class GrassHopper {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum() / nums.length;
    }
}

class GrassHopper2 {
    public static int findAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
}

class GrassHopper3 {
    public static int findAverage(int[] nums) {
        return of(nums).sum() / nums.length;
    }
}

class GrassHopper4 {
    public static int findAverage(int[] nums) {
        return (int)Arrays.stream(nums).average().orElse(0);
    }
}

class GrassHopper5 {
    public static int findAverage(int[] arr) {
        return (int) Arrays.stream(arr).average().getAsDouble();
    }
}

class GrassHopper6 {
    static int findAverage(int[] nums) {
       return (int) of(nums).average().orElse(0);
    }
}