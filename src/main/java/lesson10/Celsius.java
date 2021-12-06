package lesson10;

public class Celsius implements Conversionable {
    private double degree;

    public double getDegree() {
        return degree;
    }

    public void setDegree(final double degree) {
        this.degree = degree;
    }

    @Override
    public Conversionable convertTo(DegreeUnit unit) {
        if (unit == DegreeUnit.CELSIUS) {
            return this;
        } else if (unit == DegreeUnit.FAHRENHEIT) {
            double fDegree = degree * 9 / 5 + 32;
            return new Fahrenheit(fDegree);
        } else {
            double fKelvin = degree + 273.15;
            return new Kelvin(fKelvin);
        }
    }

    @Override
    public void convertFrom(DegreeUnit unit) {

    }
}
