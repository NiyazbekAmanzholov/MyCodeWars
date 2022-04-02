package kyu8.task59;

//Филиппу только что исполнилось четыре года, и он хочет знать, сколько ему будет в разные годы в будущем, например, в 2090 или 3044.
//Его родители не могут продолжать вычислять это, поэтому они попросили вас помочь им, написав программу, которая может ответить на
//        бесконечные вопросы Филиппа.
//
//Ваша задача-написать функцию, которая принимает два параметра: год рождения и год для подсчета лет по отношению.
//Поскольку Филип становится все более любопытным с каждым днем, он может вскоре захотеть узнать, сколько лет прошло
//до его рождения, поэтому ваша функция должна работать как с датами в будущем, так и в прошлом.
//
//Предоставьте выходные данные в этом формате: Для дат в будущем: "Вы ... год(ы)".
//Для дат в прошлом: "Вы родитесь в ... год(ы)". Если год рождения равен запрошенному году, ответьте: "Вы родились в этом самом году!"

//        assertEquals("You are 4 years old.", age.CalculateAge(2012, 2016));
//                assertEquals("You are 27 years old.", age.CalculateAge(1989, 2016));
//                assertEquals("You are 90 years old.", age.CalculateAge(2000, 2090));
//                assertEquals("You will be born in 10 years.", age.CalculateAge(2000, 1990));
//                assertEquals("You were born this very year!", age.CalculateAge(3400, 3400));
//                assertEquals("You are 2000 years old.", age.CalculateAge(900, 2900));
//                assertEquals("You will be born in 110 years.", age.CalculateAge(2010, 1900));
//                assertEquals("You will be born in 510 years.", age.CalculateAge(2010, 1500));
//                assertEquals("You are 1 year old.", age.CalculateAge(2011, 2012));
//                assertEquals("You will be born in 1 year.", age.CalculateAge(2000, 1999));

public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    final int age = yearTo - birth;
      return age == 0 ? "You were born this very year!" :
                    age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
                            String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
  }
}

class AgeDiff2 {
  public static String CalculateAge(int birth, int yearTo) {
    int a = yearTo - birth;

    if (a == 0) return "You were born this very year!";
    if (a == 1) return "You are 1 year old.";
    if (a == -1) return "You will be born in 1 year.";

    return a > 0 ? "You are " + a + " years old." : "You will be born in " + (-a) + " years.";
  }
}

class AgeDiff3 {
  public static String CalculateAge(int birth, int yearTo) {
    int age = Math.abs(yearTo - birth);
    String year = " years";
    if (Math.abs(yearTo - birth) == 1) {year = " year";}
    if (yearTo < birth) {return "You will be born in " + age + year + ".";}
    if (birth < yearTo) {return "You are " + age + year + " old.";}
    return "You were born this very year!";
  }
}