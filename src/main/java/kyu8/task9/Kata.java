package kyu8.task9;
//Напишите функцию, которая объединяет два отсортированных массива в один. Массивы содержат только целые числа. Кроме
//		того, конечный результат должен быть отсортирован и не иметь дубликатов.
//@Test
//public void basicTest() {
//		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, Kata.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
//		assertArrayEquals(new int[] { 2, 4, 6, 8 }, Kata.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
//		}

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(mergeArrays(new int[]{2, 4, 8}, new int[]{2, 4, 6})));
	}

	public static int[] mergeArrays(int[] first, int[] second) {

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < first.length; i++) {
			res.add(first[i]);
		}

		for (int i = 0; i < second.length; i++) {
			res.add(second[i]);
		}

		return res.stream().sorted().distinct().mapToInt(a->Integer.parseInt(String.valueOf(a))).toArray();
	}
}

class Kata2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(mergeArrays(new int[]{2, 4, 8}, new int[]{2, 4, 6})));
	}

	public static int[] mergeArrays(int[] first, int[] second) {

		String arrString = Arrays.toString(first) + Arrays.toString(second);
		String res = arrString.replace("[", "").replace("]", "")
						.replace(",", "").replace(" ", "");

		return Arrays.stream(res.split("")).mapToInt(Integer::parseInt).distinct().sorted().toArray();
	}
}