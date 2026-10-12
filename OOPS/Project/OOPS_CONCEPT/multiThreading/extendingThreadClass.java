package multiThreading;

public class extendingThreadClass {
    static void main(String[] args) {
        long startTime =System.currentTimeMillis();
        firstThread t1 = new firstThread();
        secondTask t2 = new secondTask();
        thirdTask t3 = new thirdTask();
        t1.start();
        t2.start();
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s total time taken in execution is %d",Thread.currentThread().getName(), endTime -startTime);
    }
}
