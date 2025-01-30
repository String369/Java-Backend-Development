package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        System.out.println(numbers);

        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        System.out.println(numbers.remove(300));
        System.out.println(numbers.removeAll(numbers));

        HashSet<Integer> numbers1 = new HashSet<Integer>();
        numbers1.add(100);
        numbers1.add(200);
        numbers1.add(300);
        numbers1.add(400);

        HashSet<Integer> numbers2 = new HashSet<Integer>();
        numbers2.add(100);
        numbers2.add(200);
        numbers2.add(300);
        numbers2.add(400);
        numbers2.add(500);

//        numbers1.addAll(numbers2);
//        System.out.println(numbers1);
//
//        numbers1.retainAll(numbers2);
//        System.out.println(numbers1);

        numbers2.removeAll(numbers1);
        System.out.println(numbers2);
    }
}
