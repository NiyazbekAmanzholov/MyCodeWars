package kyu8.task30;

import java.util.Arrays;
import java.util.stream.DoubleStream;

//Напишите функцию, которая принимает массив чисел и возвращает сумму чисел.
//        Числа могут быть отрицательными или нецелыми. Если массив не содержит чисел, вы должны вернуть 0.
//
//        Примеры
//        Ввод: [1, 5.2, 4, 0, -1]
//        вывод: 9.2
//        Ввод: []
//        вывод: 0
//        Ввод: [-2.398]
//        вывод: -2.398
//Предположения
//Вы можете предположить, что вам даны только числа.
//Вы не можете предположить размер массива.
//Вы можете предположить, что вы получаете массив, и если массив пуст, возвращает 0.
//Тесты ожидают точности 1e-4.
//Что мы тестируем
//Мы тестируем базовые циклы и математические операции. Это для начинающих, которые только изучают циклы и математические операции.
//Продвинутые пользователи могут найти это чрезвычайно простым и могут легко написать это в одной строке.
class SumArray {
  public static void main(String[] args) {
    System.out.println(sum(new double[] {1, 5.2, 4, 0, -1}));
  }

  public static double sum(double[] numbers) {
    return Arrays.stream(numbers).sum();
  }
}

class SumArray2 {
  public static double sum(double[] numbers) {
    return DoubleStream.of(numbers).sum();
  }
}

class SumArray3 {

  public static double sum(double[] numbers) {
    double result = 0;
    for(double value : numbers){result += value;}
    return result;
  }
}

class SumArray4 {
  public static void main(String[] args) {
    System.out.println(sum(new double[] {1, 5.2, 4, 0, -1}));
  }

  public static double sum(double[] numbers) {
    return Arrays.stream(numbers)
            .reduce(0, Double::sum);
  }
}