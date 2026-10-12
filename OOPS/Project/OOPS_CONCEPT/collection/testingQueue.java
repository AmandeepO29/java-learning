package collection;

import java.util.LinkedList;
import java.util.Queue;

public class testingQueue {
    static void main(String[] args) {
        Queue queue1 = new LinkedList() ;
        // OR
        Queue<String> queue2 =new LinkedList<>() ;
        queue2.add("Amandeep");
        queue2.add("Bishnoi");
        utility.print(queue2);
    }
}
