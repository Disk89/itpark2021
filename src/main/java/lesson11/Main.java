package lesson11;

/*
• Необходимо симулировать дорожную ситуацию с возможностью проезда через КПП. Приложение поддерживает работу с
автомобилями двух типов: легкового и грузового. Оба типа имеют такие характеристики как номер автомобиля, скорость
передвижения, собственный вес, габариты (ширина, высота и длина).
• Если автомобиль двигается со скоростью, превышающую допустимые 80 км/ч, должна генерироваться исключительная ситуация,
сообщающая об этом. Если данное превышение составляет более 100 км/ч, должна быть привлечена полиция, которую ловит
преступника и также в консоль сообщается об этом с указанием номера автомобиля.
• При проезде КПП учитываются размеры авто, допустим проезд легкого и грузового транспорта с соблюдением след. условий:
 1. Вес автомобиля не должен превышать 8 тон (в противном случае генерируется исключение о невозможности проезда и
 указании номера авто и его типа)
 2. Габариты авто не должны превышать 4 м высоты и 2.5 м ширины (иначе генерируется исключение,указанное в п.1)
• На вход программе передаются несколько десятков автомобилей различных типов и различных характеристик (способ
генерации не важен: запрос у пользователя через консоль или заранее подготовленные экземпляры).
Эмулировать проезд автомобилей через КПП с учетом выше объявленных проверок.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[100];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = i < 5 ? new Car(randomInt(100, 999),randomInt(300, 2000),
                    new Dimensions(5, randomDouble(1, 3), randomDouble(2,5))) : new Truck(
                            randomInt(100, 999),randomInt(2000, 10000),
                    new Dimensions(15, randomDouble(2, 3), randomDouble(3,10)));
            vehicles[i].move(randomInt(5, 120));
        }
        for (Vehicle vehicle : vehicles) {
            try {
                Checkpoint.checkTransport(vehicle);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        }

    }

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static double randomDouble(int min, int max) {
        return Math.random() * (max - min) + min;
    }
}