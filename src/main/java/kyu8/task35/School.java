package kyu8.task35;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

//		assertEquals(2,School.getAverage(new int[] {2,2,2,2}));
//				assertEquals(3,School.getAverage(new int[] {1,2,3,4,5}));
//				assertEquals(1,School.getAverage(new int[] {1,1,1,1,1,1,1,2}));
public class School {

	public static void main(String[] args) {
		System.out.println(getAverage(new int[] {1,1,1,1,1,1,1,2}));
	}

 	public static int getAverage(int[] marks) {
		OptionalDouble f = Arrays.stream(marks).average();
		return (int) f.getAsDouble();
	}
}

class School2 {

	public static int getAverage(int[] marks){
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum / marks.length;
	}
}

class School3{
	public static int getAverage(int[] marks){
		return (int) Arrays.stream(marks).average().orElse(Double.NaN);
	}
}

class Schoo4 {
	public static int getAverage(int[] marks){
		return (IntStream.of(marks).sum())/marks.length;
	}
}

class School5 {
	static int getAverage(int[] marks) {
		return (int) IntStream.of(marks).average().getAsDouble();
	}
}