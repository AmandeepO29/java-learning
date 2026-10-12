package executorServices;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class testFactorial {
    static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                factorialCalculator task =new factorialCalculator(i);
                list.add(service.submit(task));
            }
            for (Future<Integer> future : list) {
                System.out.printf("\n factorial is  %d "  ,future.get());
            }
            if (!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Emenrgency shutdown ");
                service.shutdown();
            }
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
