package kyu8.task51;

public class FirstClass {
    public static byte sum (byte a, byte b) {
        return (byte) (a + b);
    }
}

class FirstClass2 {
    static byte sum(byte a, byte b) {
        return a += b;
    }
}