package kyu8.task6.kata19;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {

    public String spinWords(String sentence) {

        String result = Stream.of(sentence.split(" "))
                .map(s-> s.length()>=5 ? new StringBuilder(s).reverse() : s)
                .collect(Collectors.joining(" "));
        return result;
    }
}