package kyu8.task6.kata14;

import java.util.*;
public class SpinWords {
  public String spinWords(String sentence) {
    Scanner scan = new Scanner(sentence);
    int count = 0;
    String newSentence = "";
    while(scan.hasNext()){
      String line = scan.next();
      if(count > 0) newSentence += " ";
      if(line.length() < 5) newSentence += line;
      else{
        String temp = "";
        for(int i = line.length()-1; i >= 0; i--){
          temp += line.charAt(i);
        }
        newSentence += temp;
      }
      count++;
    }
      return newSentence;
  }
}