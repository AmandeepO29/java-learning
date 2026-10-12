package collection;

import java.util.HashSet;
import java.util.Set;

public class testingSet {
    static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("aman"));
        System.out.println(set.add("abc"));
        System.out.println(set.add("aman")); // returns false as it is already present in set
        utility.print(set);
    }
}
