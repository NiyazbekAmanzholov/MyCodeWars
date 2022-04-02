package kyu8.task48;

public class BooleanToString {

  public static void main(String[] args) {
    System.out.println(convert(true));

  }

  public static String convert(boolean b){
    if(b) {
      return "true";
    } else {
      return "false";
    }
  }
}

class BooleanToString2 {
  public static String convert(boolean b){
    return b ? "true" : "false";
  }
}

class BooleanToString3 {
  public static String convert(boolean b){
    return Boolean.toString(b);
  }
}

class BooleanToString4 {
  public static String convert(boolean b){
    return b+"";
  }
}

class BooleanToString5 {
  public static String convert(boolean b){
    return String.valueOf(b);
  }
}

