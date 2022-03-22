package kyu8.task13;

public class OppositesAttract {
//    assertEquals(true, OppositesAttract.isLove(1, 4));
//    assertEquals(false, OppositesAttract.isLove(2, 2));
//    assertEquals(false, OppositesAttract.isLove(1, 1));
//    assertEquals(true, OppositesAttract.isLove(0, 1));
  public static void main(String[] args) {
    System.out.println(OppositesAttract.isLove(0, 1));
  }

  public static boolean isLove(final int flower1, final int flower2) {

    if (flower1 == 0 || flower2 == 1) {
      return true;
    }

    if (flower1 % flower2 != 0) {
      return true;
    }

    if (flower1 % flower2 == 0) {
      return false;
    }

        return true;
  }
}