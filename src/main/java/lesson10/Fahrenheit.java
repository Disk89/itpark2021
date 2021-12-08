package lesson10;

public class Fahrenheit implements Conversionable{
    private double degree;

    public Fahrenheit() {
    }

    public Fahrenheit(double degree) {
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
        if (unit == DegreeUnit.FAHRENHEIT) {
            return this;
        }
        double tmpDegree = (degree - FAHRENHEIT_CONST) * (5.0 / 9);
        if (unit == DegreeUnit.CELSIUS) {
            return new Celsius(tmpDegree);
        }
        else {
            return new Kelvin(tmpDegree + ABS_ZERO);
        }
    }

    @Override
    public void convertFrom(DegreeUnit unit) {

    }

    @Override
    public String toString() {
        return "Fahrenheit{" +
               "degree=" + degree +
               '}';
    }
}
