package Bishnoi.Aman.abstraction;

public class square extends shape {
    private final double side;

    public square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
