package kyu8.task22;

class Kata {

  public static void main(String[] args) {
    System.out.println(numberToString(123));
  }

  public static String numberToString(int num) {
    return Integer.toString(num);
  }
}

class Kata2 {
  public static String numberToString(int num) {
    return String.valueOf(num);
  }
}

class Kata3 {
  public static String numberToString(int num) {
    return ""+num;
  }
}

class Kata4 {
  public static String numberToString(int num) {
    return String.format("%d",num);
  }
}