package ArithmeticException;

import java.util.Scanner;

public class divisionException {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter two numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            int result = a / b;
            System.out.printf(" resuult of division is %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println(" !!! division by zero ");
            } else {
                throw exception;
            }
        }
    }
}
