package myJava.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExample {
    static void main() {
//        Queue<Integer> queue= new LinkedList<>();
//        queue.add(23);
//        queue.add(24);
//        queue.add(29);
//        queue.add(6);
//        System.out.println(queue.peek());

        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(29);
        deque.add(23);
        deque.addFirst(32);
        deque.addLast(24);
        System.out.println(deque);
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
    }
}
