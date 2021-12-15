package lesson11;

public class Truck extends Vehicle {
    public Truck(int number, int weight, Dimensions dimensions) {
        super(number, weight, dimensions);
    }

    @Override
    public String toString() {
        return "Truck{" +
               "number=" + number +
               ", speed=" + speed +
               ", weight=" + weight +
               ", dimensions=" + dimensions +
               '}';
    }
}
