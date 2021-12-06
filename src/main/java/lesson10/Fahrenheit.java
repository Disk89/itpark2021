package lesson10;

public class Fahrenheit implements Conversionable{
    private double degree;

    public Fahrenheit() {
    }

    public Fahrenheit(final double degree) {
        this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    @Override
    public Conversionable convertTo(DegreeUnit unit) {
        return null;
    }

    @Override
    public void convertFrom(DegreeUnit unit) {

    }
}
