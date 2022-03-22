package kyu8.task4;;

public class isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("moose"));
    }

    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    } 
}