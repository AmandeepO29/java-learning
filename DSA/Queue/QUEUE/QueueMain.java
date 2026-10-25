package myJava.QUEUE;

public class QueueMain {
    static void main() throws Exception {
        CircularQueue queue=new CircularQueue(5);
        queue.insert(29);
        queue.insert(3);
        queue.insert(5);
        queue.insert(9);
        queue.insert(2);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(22);
        queue.display();
    }
}
