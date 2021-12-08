package lesson10;

public interface Conversionable {
    double ABS_ZERO = 273.15;
    int FAHRENHEIT_CONST = 32;
    Conversionable convertTo(DegreeUnit unit);
}
