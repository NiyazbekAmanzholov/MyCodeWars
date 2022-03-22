package kyu8.task36;
import java.util.Arrays;
import java.util.List;

//assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));

public class MixedSum {

	public static void main(String[] args) {
		MixedSum mixedSum = new MixedSum();
		System.out.println(mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
	}

	public int sum(List<?> mixed) {
		return mixed.stream().map(a -> Integer.parseInt(a.toString())).mapToInt(Integer::intValue).sum();
	}
}

class MixedSum2 {
	public int sum(List<?> mixed) {
		return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
	}
}

class MixedSum3 {

	public int sum(List<?> mixed) {
		int sum = 0;

		for (Object element : mixed)
		{
			if (element instanceof Integer)
			{
				sum += (Integer) element;
			}
			else if (element instanceof String){
				sum += Integer.parseInt( (String) element );
			}
		}
		return sum;
	}
}

class MixedSum4 {
	public int sum(List<?> mixed) {
		int x = 0;
		for(Object s: mixed){
			x+=Integer.parseInt(s.toString());
		}
		return x;
	}
}

class MixedSum5 {
	public int sum(List<?> mixed) {
		return mixed.stream()
				.map(Object::toString)
				.map(Integer::valueOf)
				.reduce(0, (a, b) -> a + b);
	}
}

class MixedSum6 {
	public int sum(List<?> mixed) {
		return mixed.stream()
				.map(Object::toString)
				.map(Integer::valueOf)
				.reduce(0, Integer::sum);
	}
}

class MixedSum7{
	public int sum(List<?> mixed) {
		return mixed.stream().mapToInt(i -> Integer.parseInt(String.valueOf(i))).sum();
	}
}