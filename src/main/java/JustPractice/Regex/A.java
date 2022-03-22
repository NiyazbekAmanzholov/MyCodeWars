package JustPractice.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");

        while (m.find()) {
            System.out.println(m.start() + " " + m.group() +" ");
        }
        System.out.println("");
    }
}

class B {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("1\\+1=2");
        Matcher m = p.matcher("1+1=2" +
                "");

        while (m.find()) {
            System.out.println(m.start() + " " + m.group() +" ");
        }
        System.out.println("");
    }
}