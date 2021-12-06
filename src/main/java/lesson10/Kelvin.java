package lesson10;

public class Kelvin implements Conversionable{
    public double degree;
    public Kelvin(){}

    public Kelvin(final double degree) {
        this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(final double degree) {
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
