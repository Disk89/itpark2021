package lesson10;

public class Celsius implements Conversionable {
    private double degree;

    public Celsius() {
    }

    public Celsius(final double degree) {
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
        double tmpDegree;
        if (unit == DegreeUnit.CELSIUS) {
            return this;
        } else if (unit == DegreeUnit.FAHRENHEIT) {
            tmpDegree = degree * (9.0 / 5) + FAHRENHEIT_CONST;
            return new Fahrenheit(tmpDegree);
        } else {
            tmpDegree = degree + ABS_ZERO;
            return new Kelvin(tmpDegree);
        }
    }

    @Override
    public String toString() {
        return "Celsius{" +
               "degree=" + degree +
               '}';
    }
}