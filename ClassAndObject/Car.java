package ClassAndObject;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;
    public void drive(){
        currentFuel --;
    }
    public Car start(){
        if(currentFuel==0){
            System.out.println("CAr is out of fuel");
        }
        else if (currentFuel<5) {
            System.out.println("CAr is in reserved mode , please add fuel");
        }
        else
        {
            System.out.println("car is satrted //..... bbrrruuuuhhhh");
        }
        return this;
    }

    public void addFuel(float currentFuel){
        this.currentFuel+=currentFuel;
    }
    public float getCurrentFuel(){
        return currentFuel ;
    }
}
