package kyu8.task6.kata4;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] splitted = sentence.split(" ");
        StringBuilder mainBuilder = new StringBuilder();
        for (String s : splitted) {
            if (s.length() > 4) {
                StringBuilder tempBuilder = new StringBuilder();
                tempBuilder.append(s).reverse();
                mainBuilder.append(tempBuilder).append(" ");
            } else {
                mainBuilder.append(s).append(" ");
            }
        }
        mainBuilder.deleteCharAt(mainBuilder.length() - 1);
        return mainBuilder.toString();
    }
}