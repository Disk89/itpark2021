package lesson11;

public class Car extends Vehicle {


    public Car(int number, int weight, Dimensions dimensions) {
        super(number, weight, dimensions);
    }

    @Override
    public String toString() {
        return "Car{" +
               "number=" + number +
               ", speed=" + speed +
               ", weight=" + weight +
               ", dimensions=" + dimensions +
               '}';
    }
}
