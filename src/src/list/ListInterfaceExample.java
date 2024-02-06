package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterfaceExample {
    public static void main(String[] args) {

        // We cannot instantiate the interface. We need to use concrete class
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> vectors = new Vector<Integer>();

    }
}
