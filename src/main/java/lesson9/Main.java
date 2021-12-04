package lesson9;

import java.util.Random;

public class Main {
    public static final int MAX_DISTANCE = 1000;

    public static void main(String[] args) {
        Random random = new Random();
        Automobile[] vehicles = new Automobile[10];
        for (int i = 0; i < vehicles.length ; i++) {
            vehicles[i] =  i < 5 ? new Car() : new Truck();
        }
        for (Automobile vehicle : vehicles) {
            vehicle.move(random.nextInt(MAX_DISTANCE));
        }
    }

}
