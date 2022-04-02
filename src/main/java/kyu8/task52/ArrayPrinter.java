package kyu8.task52;

//Вход: Массив элементов
//        ["h","o","l","a"]
//        Вывод: строка с разделителями-запятыми элементов массива в том же порядке.
//        "h,o,l,a"

//    Integer[] array=new Integer[]{2,4,5,2};
//            assertEquals("2,4,5,2",ArrayPrinter.printArray(array));

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static void main(String[] args) {
        Integer[] array=new Integer[]{2,4,5,2};
        System.out.println(printArray(array));
    }

    public static String printArray(Object[] array) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}

class ArrayPrinter2 {

    public static String printArray(Object[] array) {
        StringBuilder sb = new StringBuilder(7);
        int i = 0;
        for(; i < array.length - 1; i++){
            sb.append(array[i]);
            sb.append(",");
        }
        sb.append(array[i]);
        return sb.toString();
    }
}

class ArrayPrinter3 {
    public static String printArray(Object[] a) {
        return Arrays.toString(a).replaceAll("[\\[\\]\\s]", "");
    }
}

class ArrayPrinter4 <T> {
    public static <T> String printArray (T[] array) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (T item : array) {
            if(first) {
                first = false;
            } else {
                sb.append(",");
            }
            sb.append(item.toString());
        }
        return sb.toString();
    }
}