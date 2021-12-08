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
        double tmpDegree;
        if (unit == DegreeUnit.KELVIN) {
            return this;
        } else if (unit == DegreeUnit.CELSIUS) {
            tmpDegree = degree - ABS_ZERO;
            return new Celsius(tmpDegree);
        } else {
            tmpDegree = (degree - ABS_ZERO) * (9.0 / 5) + FAHRENHEIT_CONST;
            return new Fahrenheit(tmpDegree);
        }
    }

    @Override
    public void convertFrom(DegreeUnit unit) {

    }

    @Override
    public String toString() {
        return "Kelvin{" +
               "degree=" + degree +
               '}';
    }
}
