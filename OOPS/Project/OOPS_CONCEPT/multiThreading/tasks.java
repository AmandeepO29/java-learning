package multiThreading;

public class tasks {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* " ,i+1);
        }
        System.out.println(" ");

        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# " ,i+1);
        }
        System.out.println(" ");

        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d$ " ,i+1);
        }
        System.out.println(" ");
        
        long endTime = System.currentTimeMillis();
        System.out.printf("total time taken in execution is %d",endTime -startTime);
    }
}
