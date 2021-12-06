package lesson10;

public interface Conversionable {
    Conversionable convertTo(DegreeUnit unit);
    void convertFrom(DegreeUnit unit);
}
