package lesson11;

public abstract class Vehicle {
    protected int number;
    protected int speed;
    protected int weight;
    protected Dimensions dimensions;

    public Vehicle(int number, int weight, Dimensions dimensions) {
        this.number = number;
        this.weight = weight;
        this.dimensions = dimensions;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(final Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    void move(int speed) {
        this.setSpeed(speed);
    }
}

