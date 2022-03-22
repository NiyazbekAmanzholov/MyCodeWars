package kyu8.task37;

//Вам дается массив (который будет иметь длину не менее 3, но может быть очень большим),
//содержащий целые числа. Массив либо полностью состоит из нечетных целых чисел, либо полностью состоит из четных целых чисел,
//за исключением одного целого Nчисла . Напишите метод, который принимает массив в качестве аргумента и возвращает этот "выброс" N.
public class Main {
    public static void main(String[] args) {
        int[] integers = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        System.out.println(FindOutlier.find(integers));
    }
}

class FindOutlier{
    static int find(int[] integers){

        if (integers.length < 4) {
            for (int i = 0; i < integers.length; i++) {

                if (integers[i] == 0) {
                    return integers[i];
                }
            }
        }

        for (int i = 0; i < integers.length; i++) {

            if (integers.length > 5 && integers[i] % 2 == 0) {
                return integers[i];
            } else if (integers[i] % 2 != 0) {
                return integers[i];
            }
        }
        return 0;
    }
}