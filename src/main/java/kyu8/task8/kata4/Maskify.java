package kyu8.task8.kata4;//Maskify.Maskify("4556364607935616"); // should return "############5616"
//        Maskify.Maskify("64607935616");      // should return "#######5616"
//        Maskify.Maskify("1");                // should return "1"
//        Maskify.Maskify("");                 // should return ""
//
//// "What was the name of your first pet?"
//        Maskify.Maskify("Skippy");                                   // should return "##ippy"
//        Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"

import java.util.Collections;

public class Maskify {

    private static final String MASK_CHAR = "#";
    private static final int UNMASK_COUNT = 4;

    public static void main(String[] args) {
        System.out.println(Maskify.maskify("64607935616"));
    }

    public static String maskify(String str) {
        int len = str.length();
        if (len <= UNMASK_COUNT) {
            return str;
        }
        int maskCount = len - UNMASK_COUNT;
        return String.join("", Collections.nCopies(maskCount, MASK_CHAR))
                + str.substring(maskCount);
    }
}