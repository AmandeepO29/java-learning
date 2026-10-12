package Bishnoi.Aman.problems;

public class car extends vehicle{
    @Override
    public void service() {
        super.service();  // calls the vehicle's class service .......
        System.out.println("car is getting serviced ....");
    }
}
