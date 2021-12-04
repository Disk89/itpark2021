package lesson9;

public final class Car extends Automobile{
    private final int RANGE = 500;
    @Override
    public void move(int distance) {
        if (distance <= RANGE && distance >= 0) {
            System.out.println("The car drove " + distance + " km, the fuel supply is " + (RANGE - distance) + " km");
        } else {
            System.out.println("Not enough fuel for " + distance + " km");
        }
    }
}