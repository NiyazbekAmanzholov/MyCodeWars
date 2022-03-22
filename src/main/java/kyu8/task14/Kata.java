package kyu8.task14;
//Эта функция должна проверить, является ли factor фактор base.
//        Возврат true, если это фактор или false если это не так.
//        О факторах
//        Факторы-это числа, которые вы можете умножить вместе, чтобы получить другое число.
//        2 и 3 являются факторами 6, потому что: 2 * 3 = 6
//        Вы можете найти фактор, разделив числа. Если остаток равен 0, то число является фактором.
//        Вы можете использовать оператор mod (%) в большинстве языков для проверки остатка
//        Например, 2 не является фактором 7, потому что: 7 % 2 = 1
//        Примечание: base является неотрицательным числом, factor является положительным числом.

//        assertEquals(true, Kata.checkForFactor(10, 2));
//                assertEquals(true, Kata.checkForFactor(63, 7));
//                assertEquals(true, Kata.checkForFactor(2450, 5));
//                assertEquals(true, Kata.checkForFactor(24612, 3));
public class Kata {
    public static boolean checkForFactor(int base, int factor) {
        if (base % factor == 0) {
            return true;
        }
        return false;
    }
}

class Kata2 {
    static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}

class Kata3 {
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0 ? true : false;
    }
}