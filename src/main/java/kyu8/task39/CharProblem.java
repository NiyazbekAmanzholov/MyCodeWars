package kyu8.task39;
//assertEquals(9, CharProblem.howOld("9 years old"));
public class CharProblem {

  public static void main(String[] args) {
    System.out.println(howOld("9 years old"));
  }

  public static int howOld(final String herOld) {
  String chres = String.valueOf(herOld.charAt(0));
  return Integer.parseInt(chres);
  }
}

class CharProblem2 {

  public static void main(String[] args) {
    System.out.println(howOld("9 years old"));
  }

  public static int howOld(final String herOld) {
    return Character.getNumericValue(herOld.charAt(0));
  }
}

class CharProblem3 {
  public static int howOld(final String herOld) {
    String s = herOld.substring(0,1);
    return Integer.parseInt(s);
  }
}

class CharProblem4 {
  public static int howOld(String answer) {
    return answer.charAt(0) - '0';
  }
}

class CharProblem5 {
  public static int howOld(final String herOld) {
    return Integer.parseInt(herOld.substring(0, 1));
  }
}

class CharProblem6 {
  public static int howOld(final String herOld) {

    String[] s = herOld.split(" ");
    return Integer.valueOf(s[0]);
  }
}