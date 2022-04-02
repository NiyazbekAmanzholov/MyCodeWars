package kyu8.task2;
//Ваша задача - сделать функцию,которая может принимать любое неотрицательное целое число в качестве аргумента и
// возвращать его с его цифрами в порядке убывания. По сути, переставьте цифры, чтобы создать максимально
// возможное число.

//        Примеры:
//        Вход: 42145выход: 54421
//        Вход: 145263выход: 654321
//        Вход: 123456789выход: 987654321

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(DescendingOrder.sortDesc(42145));
    }
}

class DescendingOrder {
    public static int sortDesc(final int num) {
        String str = "" + num;
        String[] strr = str.split("");
        int[] arr = Arrays.stream(strr).mapToInt(Integer::parseInt).sorted().toArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) stringBuilder.append(arr[i]);

        return Integer.parseInt(stringBuilder.reverse().toString());
    }
}