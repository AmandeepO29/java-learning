package executorServices;

public class threadPool implements Runnable {
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("current thread is %s\n " , current.getName());
        try {
            Thread.sleep(randomNumber()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("ended thread is %s\n " ,current.getName());
    }
    private int randomNumber(){
        double random =  Math.random()*5 +1 ;
        return (int)random;
    }
}
