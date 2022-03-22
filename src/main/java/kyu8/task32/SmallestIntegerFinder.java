package kyu8.task32;
//Given an array of integers your solution should find the smallest integer.\
//        For example:
//        Given [34, 15, 88, 2] your solution will return 2
//        Given [34, -345, -1, 100] your solution will return -345
//        You can assume, for the purpose of this kata, that the supplied array will not be empty.

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestIntegerFinder {

    public static void main(String[] args) {
        System.out.println(SmallestIntegerFinder.findSmallestInt(new int[] {34, 15, 88, 2}));
    }

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
}

class SmallestIntegerFinder2 {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}

class SmallestIntegerFinder3 {
    public static int findSmallestInt(int[] args) {
        int min = args[0];

        for(int i = 1; i < args.length; i++){
            if(min > args[i]) min = args[i];
        }

        return min;
    }
}

class SmallestIntegerFinder4 {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}

class SmallestIntegerFinder5 {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).summaryStatistics().getMin();
    }
}