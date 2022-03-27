package kyu8.task45;
//Это ката о умножении данного числа на восемь, если это четное число, и на девять в противном случае.
//assertEquals(9, Sid.simpleMultiplication(1));
//        assertEquals(16, Sid.simpleMultiplication(2));
public class Sid {

    public static void main(String[] args) {
        System.out.println(Sid.simpleMultiplication(1));
    }

    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}

class Sid2 {
    public static int simpleMultiplication(int n) {
        return n * (n % 2 + 8);
    }
}

class Sid3 {
    public static int simpleMultiplication(int a) {
        return a * (8 + (a & 1));
    }
}