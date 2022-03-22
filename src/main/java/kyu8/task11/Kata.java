package kyu8.task11;
//* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
//        * [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
//        * [42, 54, 65, 87, 0]             -> min = 0, max = 87
//        * [5]                             -> min = 5, max = 5

import java.util.Arrays;

//@Test
//public void testExamples() {
//        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
//        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
//        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
//        assertEquals(5, kata.max(new int[]{5}));
//        }
public class Kata {

  public static void main(String[] args) {
    Kata kata = new Kata();
    System.out.println(kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
  }

  public int min(int[] list) {
    return Arrays.stream(list).min().getAsInt();
  }
  
  public int max(int[] list) {
    return Arrays.stream(list).max().getAsInt();
  }
}