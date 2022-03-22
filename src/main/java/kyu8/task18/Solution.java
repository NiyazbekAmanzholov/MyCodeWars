package kyu8.task18;
//Напишите функцию, repeatStrкоторая повторяет данную строку stringровно nраз.
//        repeatStr(6, "I") // "IIIIII"
//        repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

// public void test4a() {
//        assertEquals("aaaa", Solution.repeatStr(4, "a"));
//        }
//@Test public void test3Hello() {
//        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
//        }
//@Test public void test5empty() {
//        assertEquals("", Solution.repeatStr(5, ""));
//        }
//@Test public void test0kata() {
//        assertEquals("", Solution.repeatStr(0, "kata"));
//        }

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        System.out.println(repeatStr(5, "Hello"));
    }

    public static String repeatStr(final int repeat, final String string) {
        String res = "";

        for (int i = 0; i < repeat; i++) {
            res += string;
        }

        return res;
    }
}

class Solution2 {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }
}

class Solution3 {
    public static void main(String[] args) {
        System.out.println(repeatStr(5, "Hello"));
    }

    static String repeatStr(int repeat, String string) {
        return IntStream.range(0, repeat).mapToObj(i -> string)
                .collect(Collectors.joining());
    }
}

class Solution4 {
    public static String repeatStr(final int repeat, final String string) {
        return repeat < 0 ? "" : String.join("", Collections.nCopies(repeat, string));
    }
}

class Solution5 {
    public static String repeatStr(final int repeat, final String string) {
        if (repeat < 0) return "";
        return new String(new char[repeat]).replace("\0", string);
    }
}

class Solution6 {
    public static String repeatStr(int repeat, String string) {
        return repeat <= 0 ? "" : string + repeatStr(--repeat, string);
    }
}