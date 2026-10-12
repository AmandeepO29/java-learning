package reduceAndFilter;

import java.util.List;
import java.util.function.BinaryOperator;

public class testingReduce {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        int sum = 0;

        sum=numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.println(" ");
        System.out.printf("sum using reduce is %d " , sum);

        int newSum =0;
        // using lambdaaa
        newSum = numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println("  ");
        System.out.printf("sum using lambda is %d" , newSum);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE , (a,b)-> a>b ? a : b);

        System.out.println("\nmax number is:  " + max) ;
    }

}
