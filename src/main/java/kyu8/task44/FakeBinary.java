package kyu8.task44;
//Введение
//Первый век охватывает период с 1 по 100 год включительно, второй век - с 101 по 200 год включительно и т.д.
//        assertEquals(18, Solution.century(1705));
//                assertEquals(19, Solution.century(1900));
//                assertEquals(17, Solution.century(1601));
//                assertEquals(20, Solution.century(2000));
//                assertEquals(1,  Solution.century(89));
class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.century(1601));
    }

    public static int century(int number) {
        return (int)Math.ceil((double)number/100);
    }
}

class Solution2 {
    public static int century(int number) {
        return (number + 99) / 100;
    }
}

class Solution3 {
    public static int century(int number) {

        return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);

    }
}

class Solution4 {
    public static int century(int number) {
        return (int)Math.ceil((double)number/100);
    }
}

class Solution5 {
    public static int century(int number) {
        return (number - 1) / 100 + 1;
    }
}