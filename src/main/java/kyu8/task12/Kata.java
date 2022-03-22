package kyu8.task12;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Tester.doTest(5, "1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50");
//Tester.doTest(1, "1 * 1 = 1\n2 * 1 = 2\n3 * 1 = 3\n4 * 1 = 4\n5 * 1 = 5\n6 * 1 = 6\n7 * 1 = 7\n8 * 1 = 8\n9 * 1 = 9\n10 * 1 = 10");
class Kata {
    public static void main(String[] args) {
        System.out.println(Kata.multiTable(5));
    }

    public static String multiTable(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 11; i++) {
            int res = i * num;
            stringBuilder.append(i).append(" * ").append(num).append(" = ").append(res).append("\n");
        }
        return String.valueOf(stringBuilder).trim();
    }
}

class Kata2 {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();
    }
}

class Kata3 {

    public static String multiTable(int num) {
        String arr[] = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.format("%d * %d = %d", i + 1, num, (i + 1) * num);
        }
        return String.join("\n", arr);
    }

}

class Kata4 {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> i + " * " + num + " = " + i * num)
                .collect(Collectors.joining("\n"));
    }
}

class Kata5 {
    public static String multiTable(int num) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " * " + num + " = " + (i * num) + ((i < 10) ? "\n" : "");
        }
        return result;
    }
}

class Kata7 {
    public static String multiTable(int num) {
        String s = "";
        for (int i=1; i<11; i++) {
            if (i<10){
                s = s +(i+" * "+num + " = " + i*num+"\n");
            }else {
                s = s +(i+" * "+num + " = " + i*num);
            }
        }
        return s; // good luck
    }
}

class Kata8 {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10).mapToObj(x-> x + " * " + num + " = " + (x * num)).collect(Collectors.joining("\n"));
    }
}