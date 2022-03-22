package kyu8.task8;
//Maskify.Maskify("4556364607935616"); // should return "############5616"
//        Maskify.Maskify("64607935616");      // should return "#######5616"
//        Maskify.Maskify("1");                // should return "1"
//        Maskify.Maskify("");                 // should return ""
//
//// "What was the name of your first pet?"
//        Maskify.Maskify("Skippy");                                   // should return "##ippy"
//        Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"

public class Maskify {

    public static void main(String[] args) {
        System.out.println(Maskify.maskify("64607935616"));
    }

    public static String maskify(String str) {

        char[] simbol = str.toCharArray();
        String res = "";

        if (simbol.length <= 4) {
            return str;
        }

            for (int i = 0; i < simbol.length - 4; i++) {
                res += "#";
            }

            for (int j = simbol.length - 4; j < simbol.length; j++) {
                res += simbol[j];
            }

        return res;
    }
}