package kyu7Arrays.task1;

//Учитывая последовательность чисел, найдите наибольшую сумму пар в последовательности.
//
//        Например
//
//        [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
//        [99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
//        Входная последовательность содержит минимум два элемента, и каждый элемент является целым числом.

//assertEquals("Failed test case [10, 14, 2, 23, 19]:", 42, Solution.largestPairSum(new int[]{10,14,2,23,19}));
//assertEquals("Failed test case [-100, -29, -24, -19, 19]:", 0, Solution.largestPairSum(new int[]{-100,-29,-24,-19,19}));
//assertEquals("Failed test case [1, 2, 3, 4, 6, -1, 2]:", 10, Solution.largestPairSum(new int[]{1,2,3,4,6,-1,2}));
//assertEquals("Failed test case [-10, -8, -16, -18, -19]:", -18, Solution.largestPairSum(new int[]{-10,-8,-16,-18,-19}));

import java.util.*;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10,14,2,23,19}));
    }

    public static int largestPairSum(int[] numbers){
        return Arrays.stream(numbers).max().getAsInt() + Arrays.stream(numbers).sorted().limit(numbers.length -1).max().getAsInt();
    }
}

class Solution2 {
    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1]+numbers[numbers.length-2];
    }
}

class Solution3 {
    public static int largestPairSum(int[] numbers){
        return IntStream.of(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
    }
}

class Solution4 {
    public static int largestPairSum(int[] arr) {
        int a = Math.min(arr[0], arr[1]), b = Math.max(arr[0], arr[1]);
        for (int i = 2, x; i < arr.length; i++)
            if ((x = arr[i]) >= b) { a = b; b = x; }
            else if (x > a) a = x;
        return a + b;
    }
}

class Solution5 {
    public static int largestPairSum(int[] numbers){
        return Arrays.stream(numbers).map(x->-x).sorted().map(x->-x).limit(2).sum();
    }
}

class Solution6 {
    public static int largestPairSum(int[] numbers){
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        return sortedNumbers[sortedNumbers.length-1] + sortedNumbers[sortedNumbers.length-2];
    }
}