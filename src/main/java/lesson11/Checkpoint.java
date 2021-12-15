package lesson11;

public class Checkpoint {
    public static void checkTransport(Vehicle vehicle) {
        if (vehicle.speed > 100) {
            throw new IllegalArgumentException("For police: This transport with the number " +
                                               vehicle.number +
                                               " moves at " +
                                               "a speed of " +
                                               vehicle.speed);
        } else if (vehicle.speed > 80) {
            throw new IllegalArgumentException(("Speed is " + vehicle.speed + " exceeded"));
        }

        if (vehicle.weight > 8000) {
            throw new IllegalArgumentException("Passage not possible weight exceeded " + vehicle);
        }
        Dimensions dimensions = vehicle.getDimensions();
        if (dimensions.getHeight() > 4.0 || dimensions.getWidth() > 2.5) {
            throw new IllegalArgumentException("Passage impossible, dimensions exceeded " + vehicle);
        }
        System.out.println("SUCCESS!");
    }
}
