package kyu8.task34;

import java.util.Arrays;
import java.util.stream.Collectors;

//assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
//assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.stringToArray("Robin Singh")));
    }

    public static String[] stringToArray(String s) {

        String[] giv = s.split(" ");
        String[] res = new String[giv.length];

        for (int i = 0; i < giv.length; i++) {
            res[i] = giv[i];
        }

      return res;
    }
}

class Solution2 {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}