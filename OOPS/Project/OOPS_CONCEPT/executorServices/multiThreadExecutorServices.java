package executorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multiThreadExecutorServices {
    static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < 10; i++) {
                threadPool task = new threadPool();
                service.submit(task);
            }
            service.shutdown();
            if(!service.awaitTermination(13, TimeUnit.SECONDS)){
                System.out.println("Emergency shutdown ");
                service.shutdownNow();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
