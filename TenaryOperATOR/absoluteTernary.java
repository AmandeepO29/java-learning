package TenaryOperATOR;

import java.util.Scanner;

public class absoluteTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number");
        int num=input.nextInt();
        int absoluteNumber = (num>0)?num:(-num);
        System.out.println(absoluteNumber+" is the absolute value of "+ num);
    }
}
