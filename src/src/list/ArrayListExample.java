package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("King");
        list.add("shreya");
        list.add("Bindu");

        System.out.println(list);
        list.remove(1);

        for(String value: list){
            System.out.println(value);
        }
    }
}
