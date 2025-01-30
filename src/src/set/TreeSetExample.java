package set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        NavigableSet<String>  set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println(set);

        System.out.println(set.contains("A"));
        System.out.println(set.contains("Z"));
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.higher("B"));
        System.out.println(set.lower("B"));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
    }
}
