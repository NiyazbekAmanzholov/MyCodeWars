package kyu8.task28;
//Инструкции
//        Вывод
//        Найти среднее значение
//        Найти среднее (среднее) из списка чисел в массиве.
//        Информация
//        Чтобы найти среднее значение (среднее значение) набора чисел,
//        сложите все числа вместе и разделите на количество значений в списке.
//        Для примера список 1, 3, 5, 7
//        1. Сложите все числа
//        1+3+5+7 = 16
//        2. Разделить на количество значений в списке. В этом примере в списке есть 4 числа.
//        16/4 = 4
//        3. Среднее (или среднее) этого списка равно 4

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

class GrassHopper {

    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1,3,5,7}));
    }

    public static int findAverage(int[] nums) {
        return (int) stream(nums).average().getAsDouble();
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
        return IntStream.of(nums).sum() / nums.length;
    }
}

class GrassHopper4 {

    public static int findAverage(int[] nums) {

        return stream(nums).sum()/(nums.length);
    }
}

class GrassHopper5 {

    public static int findAverage(int[] nums) {
        return (int)IntStream.of(nums).summaryStatistics().getAverage();
    }
}

class GrassHopper6 {

    public static int findAverage(int[] nums) {
        return (int) stream(nums).average().orElse(0);
    }
}

class GrassHopper7 {

    public static int findAverage(int[] nums) {
        if (nums.length<1){return 0;}
        return Arrays.stream(nums).sum()/nums.length;
    }
}