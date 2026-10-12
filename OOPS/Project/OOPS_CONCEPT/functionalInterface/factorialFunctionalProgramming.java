package functionalInterface;

import java.util.stream.IntStream;

public class factorialFunctionalProgramming {
    static void main(String[] args) {
        int number = 10;
        IntStream.rangeClosed(2,number)
                .reduce((a,b)->a*b)
                .ifPresent(System.out:: println);
    }
}
