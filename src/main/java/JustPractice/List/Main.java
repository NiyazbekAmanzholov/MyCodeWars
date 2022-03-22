package JustPractice.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Stream.of(3,5,7,4,3,2,1)
                .distinct().sorted().collect(Collectors.toList());

        Collections.reverse(nums);
        nums.forEach(System.out::println);
    }
}

class Main2 {
    public static void main(String[] args) {
       Stream.of(3,5,7,4,3,2,1).filter(n -> n % 2 == 0).forEach(System.out::println);
        }
    }

class Main3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,41,5,6,7);
        Stream.of(2,41,5,6,8).filter(integerList::contains).forEach(System.out::println);
    }
}