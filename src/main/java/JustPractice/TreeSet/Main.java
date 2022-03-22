package JustPractice.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet <Integer>treeadd = new TreeSet<Integer>();
        TreeSet <Integer>treereverse = new TreeSet<Integer>();

        treeadd.add(1);
        treeadd.add(13);
        treeadd.add(17);
        treeadd.add(2);
        treeadd.add(17);
        treeadd.add(2);

        treereverse = (TreeSet<Integer>) treeadd.descendingSet();

        treereverse.forEach(System.out::println);
    }
}
