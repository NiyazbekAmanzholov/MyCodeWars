package kyu8.task43;
//assertEquals("dlrow", Kata.solution("world"));

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Kata {
    public static void main(String[] args) {
        System.out.println(Kata.solution("world"));
    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

class Kata2 {
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.append(str).reverse().toString();
    }
}

class Kata3 {

    public static String solution(String str) {
        StringBuilder res = new StringBuilder(str.length());

        for (int i = (str.length() - 1); i >= 0; i--){
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}

class Kata4 {
    public static String solution(String str) {
        return new StringBuilder(str).reverse()+"";
    }
}

class Kata5 {
    public static String solution(String str) {
        return Stream.of(str)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining());
    }
}

class Kata6 {
    public static String solution(String str) {
        return new String(new StringBuffer(str).reverse());
    }
}