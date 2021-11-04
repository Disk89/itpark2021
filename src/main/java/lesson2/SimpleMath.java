package lesson2;

public class SimpleMath {

    public static void main(String[] args) {
        System.out.println(calculateSquare(-3));
    }

    /**
     * Возвращает квадрат числа
     * @param number аргумент
     * @return результат возведения числа в квадрат
     */
    private static long calculateSquare(long number) {
        return number * number;
    }
}
