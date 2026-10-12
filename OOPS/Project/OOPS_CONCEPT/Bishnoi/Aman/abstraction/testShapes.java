package Bishnoi.Aman.abstraction;

public class testShapes {
    static void main(String[] args) {
        circle circle = new circle(4.9);
        square square = new square(5.9);
        System.out.println("area of circle and square are respectively : " +circle.calculateArea()+"   " +square.calculateArea());
    }
}
