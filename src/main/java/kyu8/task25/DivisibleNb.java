package kyu8.task25;
//Создайте функцию, которая проверяет, делится ли число nна два числа x И. y
//		Все входные данные являются положительными, ненулевыми цифрами.
//		Examples:
//		1) n =   3, x = 1, y = 3 =>  true because   3 is divisible by 1 and 3
//		2) n =  12, x = 2, y = 6 =>  true because  12 is divisible by 2 and 6
//		3) n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
//		4) n =  12, x = 7, y = 5 => false because  12 is neither divisible by 7 nor 5

import java.util.Arrays;

import static java.util.Arrays.stream;

public class DivisibleNb {
	public static void main(String[] args) {
		System.out.println(DivisibleNb.isDivisible(12,4,3));
	}

	public static boolean isDivisible(long n, long x, long y) {
		return n % x==0 && n % y==0;
	}
}

class DivisibleNb2 {
	public static Boolean isDivisible(long n, long x, long y) {
		return n % x + n%y == 0;
	}
}

class DivisibleNb3 {
	public static Boolean isDivisible(long n, long x, long y) {
		return Arrays.asList(x, y).stream().allMatch(i -> n % i == 0);
	}
}

class DivisibleNb4 {
	public static boolean isDivisible(long n, long... divisors) {
		return stream(divisors).allMatch(divisor -> n % divisor == 0);
	}
}