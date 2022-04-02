package kyu8.task54_;

//Каждое число должно быть отформатировано так, чтобы оно округлялось до двух знаков после запятой. Вам не нужно проверять,
//        является ли ввод допустимым числом, потому что в тестах используются только допустимые числа.
//
//        Example:
//        5.5589 is rounded 5.56
//        3.3424 is rounded 3.34

//assertEquals(4.66, Numbers.TwoDecimalPlaces(4.659725356), 0.00);
//assertEquals(173735326.38, Numbers.TwoDecimalPlaces(173735326.3783732637948948), 0.00);

import java.util.ArrayList;
import java.util.List;

public class Kata {

  public static void main(String[] args) {
    System.out.println(TwoDecimalPlaces(173735326.3783732637948948));
  }

  public static double TwoDecimalPlaces(double number)
  {
    String s = String.valueOf(number);
    String[] ss = s.split("");

    List<String> stroka = new ArrayList<>();

    for (int i = 0; i < ss.length; i++) {
      if (ss[i].equals(".")) {
        stroka.add(ss[i]);
      }
    }

    System.out.println(stroka);

    return 0.00;
  }
}