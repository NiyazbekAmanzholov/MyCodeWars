package kyu8.task6.kata3;

public class SpinWords {

  public String spinWords(String sentence) {

       for (String a : sentence.split(" "))
       {
           if (a.length() > 4) sentence = sentence.replace(a, new  StringBuffer(a).reverse());
       }
       return sentence;
  }
}