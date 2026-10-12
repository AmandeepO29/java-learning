package LOOPS;

import java.util.Scanner;

public class pallindromeRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to pallindrome checker");
        System.out.println("enter the string : ");
        String name = input.next();
        System.out.println("your string is " + ((isPallindrome(name))? "pallindrome" : "not pallindrome" ));
    }

    public static boolean isPallindrome(String str){
        if(str.length()<=1)
            return true;
        int lastPos =str.length()-1;
        if(str.charAt(lastPos)!=str.charAt(0))
            return false;
        String newstr=str.substring(1, lastPos); 
        return isPallindrome(newstr);
    }
}
