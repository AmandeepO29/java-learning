package Bishnoi.Aman.problems;

public class calculator {
    public static int add(int a , int b){
        return a+b ;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a+b ;
    }

    static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.add(4.99,6));
        System.out.println(cal.add(4,5,6));
        System.out.println(cal.add(5,6));
    }
}
