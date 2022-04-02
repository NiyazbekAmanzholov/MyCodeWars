package kyu8.task56;

//Примечание: Не волнуйтесь, все входные данные будут строками, и каждая строка является
//        совершенно допустимым представлением целого числа.
//
//        Примеры
//        "1234" --> 1234
//        "605"  --> 605
//        "1405" --> 1405
//        "-7" --> -7

//    assertEquals("stringToNumber(1234)", 1234 , StringToNumber.stringToNumber("1234"));

//    assertEquals("stringToNumber(605)", 605 , StringToNumber.stringToNumber("605"));

//    assertEquals("stringToNumber(1405)", 1405 , StringToNumber.stringToNumber("1405"));

//    assertEquals("stringToNumber(-7)", -7 , StringToNumber.stringToNumber("-7"));

public class StringToNumber {

  public static void main(String[] args) {
    System.out.println(stringToNumber("-1234"));
  }

  public static int stringToNumber(String str) {
    return Integer.parseInt(str);
  }
}

class StringToNumber2 {
  public static int stringToNumber(String str) {
    return Integer.valueOf(str);
  }
}