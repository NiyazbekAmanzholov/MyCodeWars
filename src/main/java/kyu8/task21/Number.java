package kyu8.task21;
//В этом Ката мы передаем число (n) в функцию.
//Ваш код определит, является ли переданное число четным (или нет).
//Функция должна возвращать либо true, либо false.
//Числа могут быть положительными или отрицательными, целыми числами или поплавками.
//Поплавки с десятичной частью, не равной нулю, считаются неравномерными для этого ката.

//assertEquals(true, num.isEven(0));
//assertEquals(false, num.isEven(0.5));
//assertEquals(false, num.isEven(1));
//assertEquals(true, num.isEven(2));
//assertEquals(true, num.isEven(-4));

public class Number {

  public static void main(String[] args) {
    Number number = new Number();
    System.out.println(number.isEven(2));
  }

  public boolean isEven(double n) {
      return n % 2 == 0;
  }
}