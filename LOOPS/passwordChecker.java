package LOOPS;

import java.util.Scanner;

import Array.arrayUtility;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean isValid;
        String password;
        do{
            System.out.println("enter passowrd");
            password=input.next();

        }while(!isValid(password));
        System.out.println("thanks for entering right passowrd");
    }

    public static boolean isValid(String password){
        return password.length()>6;
    }
}
