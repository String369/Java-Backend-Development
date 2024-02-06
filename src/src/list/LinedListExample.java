package list;

import java.util.LinkedList;
import java.util.List;

public class LinedListExample {
    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<String>();

        System.out.println(linkedList.size());

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JavaScript");
        linkedList.add("Web3");

        System.out.println(linkedList);

        linkedList.add(2, "C++");

        System.out.println(linkedList);

        linkedList.remove(0);
        linkedList.remove("JavaScript");

        System.out.println(linkedList);

        System.out.println(linkedList.size());

    }
}
