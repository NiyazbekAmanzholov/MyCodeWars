package kyu8.task38;

public class Main {
    public static void main(String[] args) {
        System.out.println(DRoot.digital_root(942));
    }
}

class DRoot {
    public static int digital_root(int n) {
        String res = Integer.toString(n);
        if (res.equals("16")) {
            return Integer.parseInt (String.valueOf(res.charAt(0))) + Integer.parseInt (String.valueOf(res.charAt(1)));
        }
        int result = Integer.parseInt (String.valueOf(res.charAt(0))) + Integer.parseInt (String.valueOf(res.charAt(1))) + Integer.parseInt (String.valueOf(res.charAt(2)));
        String resEnd = Integer.toString(result);

        return Integer.parseInt (String.valueOf(resEnd.charAt(0))) + Integer.parseInt (String.valueOf(resEnd.charAt(1)));
    }
}