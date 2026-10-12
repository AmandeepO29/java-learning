package multiThreading;

public class syncronisedThreadTesting {
    static void main(String[] args) throws InterruptedException {
        counter counter = new counter();
        synchronisedThread t1 = new synchronisedThread(counter);
        synchronisedThread t2 = new synchronisedThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
