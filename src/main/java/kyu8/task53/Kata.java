package kyu8.task53;
//Нам нужна функция, которая может преобразовать число в строку.
//        Какие способы достижения этого вы знаете?
//        Примеры:
//        123 --> "123"
//        999 --> "999"

//    assertEquals("67", Kata.numberToString(67));
//            assertEquals("123", Kata.numberToString(123));
//            assertEquals("999", Kata.numberToString(999));

class Kata {
  public static void main(String[] args) {
    System.out.println(numberToString(123));
  }
  public static String numberToString(int num) {
    return num+"";
  }
}