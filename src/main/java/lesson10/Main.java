package lesson10;

import java.util.Random;

/*
Необходимо реализовать конвертер температур, который сможет переводить единицы измерения одной системы в другую
(например, из Цельсий в Фаренгейты, или из Кельвин в Цельсий).

Конвертер должен быть универсальным с возможностью перевода в обоих направлениях для каждой из комбинаций.
В задании требуется максимально воспользоваться возможностями интерфейсов и перечислений, насколько это возможно.

По тому же принципу можно реализовать валютный конвертер или любой понравившийся
 */
public class Main {
    public static void main(String[] args) {
        DegreeUnit[] degreeUnits = {DegreeUnit.CELSIUS, DegreeUnit.FAHRENHEIT, DegreeUnit.KELVIN};

        Random random = new Random();
        Celsius celsius = new Celsius(random.nextInt(100));
        for (int i = 0; i < 10; i++) {
            Conversionable tmp = celsius.convertTo(degreeUnits[random.nextInt(3)]);
            System.out.println(tmp);
        }

    }
}
