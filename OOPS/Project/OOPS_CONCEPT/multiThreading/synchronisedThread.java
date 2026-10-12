package multiThreading;

class counter{
    private int count =0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
public class synchronisedThread extends Thread{
    private counter counter;

    public synchronisedThread(counter counter) {
        this.counter = counter;
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
