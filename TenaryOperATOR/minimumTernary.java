package TenaryOperATOR;

import java.util.Scanner;

public class minimumTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();  
        minimumTernary ternary=new minimumTernary();
        int smallest=ternary.min(num1,num2);
        System.out.println(smallest+" is the smallest number");


    }
    public int min(int a,int b){
        return (a<b)?a:b;
    }

}
