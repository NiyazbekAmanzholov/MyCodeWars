package kyu8.task2;
//Ваша задача - сделать функцию,которая может принимать любое неотрицательное целое число в качестве аргумента и
// возвращать его с его цифрами в порядке убывания. По сути, переставьте цифры, чтобы создать максимально
// возможное число.

//        Примеры:
//        Вход: 42145выход: 54421
//        Вход: 145263выход: 654321
//        Вход: 123456789выход: 987654321

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 42145;
        System.out.println(DescendingOrder.sortDesc(a));
    }
}

class DescendingOrder {
    public static int sortDesc(final int num) {
        String stringNum = Integer.toString(num);
        char[] chars = stringNum.toCharArray();

        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }

        int[] array = characters.stream().mapToInt(ch -> Integer.parseInt(String.valueOf(ch))).sorted().toArray();

        StringBuilder total = new StringBuilder();
        for (int j : array) {
            total.append(j);
        }

        return Integer.parseInt(total.toString());
    }
}