package kyu8.task1.kata;

class A1 {
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
    public static String whoLikesIt(String... nms) {
        switch (nms.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", nms[0]);
          case 2: return String.format("%s and %s like this", nms[0], nms[1]);
          case 3: return String.format("%s, %s and %s like this", nms[0], nms[1], nms[2]);
          default: return String.format("%s, %s and %d others like this", nms[0], nms[1], nms.length - 2);
        }
    }
}