package kyu8.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AreSame {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a, b));
    }

	public static boolean comp(int[] a, int[] b) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();

        if (a == null || b == null) {
            return false;
        }

        if (a.length < 0 || b.length < 0) {
            return false;
        }

        for (int i = 0; i < b.length; i++) {
            integerList.add(a[i] * a[i]);
            integerList2.add(b[i]);
        }

        List<Integer> res = integerList.stream().sorted().collect(Collectors.toList());
        List<Integer> res2 = integerList2.stream().sorted().collect(Collectors.toList());

        return res.equals(res2);
    }
}

class AreSame2 {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        Arrays.sort(b);
        return Arrays.equals(Arrays.stream(a).sorted().map(n -> n * n).toArray(), b);
    }
}