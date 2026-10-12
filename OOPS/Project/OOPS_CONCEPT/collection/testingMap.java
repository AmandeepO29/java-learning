package collection;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class testingMap {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Amandeep" , 168);
        map.put("Rahul",190);
        System.out.println(map.size());
        System.out.println(map.get("abc"));
        System.out.println(map.remove("Rahul")); // it returns the value associated with the key...
        System.out.println(map.size());
    }
}
