package kyu7Arrays.task9_;
//Массив сортируется по кругу, если элементы отсортированы в порядке возрастания, но смещены или повернуты на любое количество шагов.
//        Завершите функцию/метод, который определяет, является ли данный массив целых чисел циклически отсортированным.
//        Примеры
//        Эти массивы сортируются по кругу (true).:
//        [2, 3, 4, 5, 0, 1]       -->  [0, 1] + [2, 3, 4, 5]
//        [4, 5, 6, 9, 1]          -->  [1] + [4, 5, 6, 9]
//        [10, 11, 6, 7, 9]        -->  [6, 7, 9] + [10, 11]
//        [1, 2, 3, 4, 5]          -->  [1, 2, 3, 4, 5]
//        [5, 7, 43, 987, -9, 0]   -->  [-9, 0] + [5, 7, 43, 987]
//        [1, 2, 3, 4, 1]          -->  [1] + [1, 2, 3, 4]

import java.util.Arrays;

public class CircleSorted {

    public static void main(String[] args) {
        CircleSorted circleSorted = new CircleSorted();
        System.out.println(circleSorted.isCircleSorted(new int[] {2, 3, 4, 5, 0, 1}));
    }

    public boolean isCircleSorted(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == i) {
                return true;
            }
        }

        return false;
    }
}