package kyu8.task6.kata7;

public class SpinWords {

  public String spinWords(String sentence) {
    //TODO: Code stuff here
    StringBuilder sb = new StringBuilder();
    String[] strs = sentence.split(" ");
    for(int i = 0;i<strs.length;i++){
      if(strs[i].length()<5){
        sb.append(strs[i]);
      }else{
        for(int j = 0;j<strs[i].length();j++){
          sb.append(strs[i].charAt(strs[i].length()-j-1));
        }
      }
      if(i<strs.length-1){
        sb.append(" ");
      }

    }
    return sb.toString();
  }
}