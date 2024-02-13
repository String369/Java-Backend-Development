package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Bindu");
        map.put(103, "Sindu");
        map.put(104, "Indu");

        for(Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " : "+ m.getValue());
        }

        System.out.println(map.get(103));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(100));
        map.clear();
        System.out.println(map);
    }
}
