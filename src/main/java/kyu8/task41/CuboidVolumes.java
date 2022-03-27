package kyu8.task41;

import java.util.Arrays;

//В этом простом упражнении вы создадите программу, которая возьмет два списка целых чисел, aи b. Каждый список будет состоять
//из 3 положительных целых чисел выше 0, представляющих размеры кубоидов aи b. Вы должны найти разность объемов кубоидов независимо
//от того, какой из них больше.
//Например, если переданные параметры ([2, 2, 3], [5, 4, 1])равны, то объем aравен 12, а объем bравен 20. Поэтому функция должна возвращать 8.
//Ваша функция будет протестирована как на готовых примерах, так и на случайных.
//Если можете, попробуйте написать это в одной строке кода.
//assertEquals(14, CuboidVolumes.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
public class CuboidVolumes {

  public static void main(String[] args) {
    System.out.println(findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
  }

  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    return Arrays.stream(firstCuboid).reduce(1, (a,b) -> a * b) - Arrays.stream(secondCuboid).reduce(1, (a,b) -> a * b);
  }
}

class CuboidVolumes2 {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int vol1 = 1, vol2 = 1;
    for (int i = 0; i < 3; i++) {
      vol1 *= firstCuboid[i];
      vol2 *= secondCuboid[i];
    }

    return Math.abs(vol1 - vol2);
  }
}