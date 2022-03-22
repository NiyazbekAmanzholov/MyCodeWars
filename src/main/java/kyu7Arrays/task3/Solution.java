package kyu7Arrays.task3;
//В этом Ката вам будет дан массив чисел, в котором два числа встречаются один раз, а остальные встречаются только
//        дважды. Вашей задачей будет вернуть сумму чисел, которые встречаются только один раз.
//
//        Например, repeats([4,5,7,5,4,8]) = 15потому что только числа 7и 8встречаются один раз, а их сумма равна 15.
//        Каждое второе число встречается дважды.

//assertEquals(15,Solution.repeats(new int []{4,5,7,5,4,8}));
//        assertEquals(19,Solution.repeats(new int []{9, 10, 19, 13, 19, 13}));
//        assertEquals(12,Solution.repeats(new int []{16, 0, 11, 4, 8, 16, 0, 11}));

import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        System.out.println(Solution.repeats(new int []{4,5,7,5,4,8}));
    }

    public static int repeats(int[] arr){

        String a = Arrays.toString(arr);

        return Arrays.stream(arr).distinct().sum();
    }
}