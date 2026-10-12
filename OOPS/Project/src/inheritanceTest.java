package Bishnoi.Aman.Inheritance;

public class inheritanceTest {
    static void main(String[] args) {
        vehicle vehicle = new vehicle();
        vehicle.commute();
        twoWheeler two= new twoWheeler();
        two.commute();
        two.balance();
        motorcycle splendor = new motorcycle();
        splendor.numberOfTyres =6;
        splendor.commute();
        splendor.balance();
        splendor.start();

    }
}
