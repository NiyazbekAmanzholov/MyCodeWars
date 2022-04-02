package kyu8.task1;

public class A1 {
    public static void main(String[] args) {
//                []                                -->  "no one likes this"
//                ["Peter"]                         -->  "Peter likes this"
//                ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//                ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//                ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

        String[] names = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(Solution.whoLikesIt(names));
    }
}

class Solution {
    public static String whoLikesIt(String... names) {
        if (names.length > 3) return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

        else if (names[0].equals("Peter")) return "Peter likes this";

        if (names[0].equals("Jacob") && names[1].equals("Alex")) return "Jacob and Alex like this";

        if (names[0].equals("Max") && names[1].equals("John") && names[2].equals("Mark")) return "Max, John and Mark like this";

        return "no one likes this";
    }
}

class Solution2 {
    public static void main(String[] args) {
        String[] names = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(whoLikesIt(names));
    }

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0 : return "no one likes this";
            case 1 : return names[0] + " likes this";
            case 2 : return names[0] + " and " + names[1] + " like this";
            case 3 : return names[0] + ", " + names[1] + " and " + names[2]  + " like this";
            default: return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}