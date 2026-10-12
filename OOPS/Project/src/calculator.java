package Bishnoi.Aman.circleAndRectangleAreaByPackage.utils;
import Bishnoi.Aman.circleAndRectangleAreaByPackage.geometry.circle ;
import Bishnoi.Aman.circleAndRectangleAreaByPackage.geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle c= new circle(6.77);
        rectangle rectangle = new rectangle(6,8);
        double circleArea= Math.PI * Math.pow(c.radius,2);
        double RectangleArea = rectangle.length*rectangle.breadth;
        System.out.println("Area of rectangle is "+RectangleArea);
        System.out.println("Area of Circle is "+circleArea);
    }
}
