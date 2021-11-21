package lesson5;

import java.util.Scanner;

// Условие: Вывести n-ый член последовательности Фибоначчи, где параметр n запрашивается в консоли у пользователя
public class MyFibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Вывести n-ый член последовательности Фибоначчи. Для выхода введите отрицательное число");
            n = scanner.nextInt();
            myFibNumber(n);
        } while (n >= 0);
    }

    private static void myFibNumber(int num) {
        if (num < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            long f0 = 0;
            long f1 = 1;
            long fn = num;
            for (int i = 2; i <= num; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println((long) fn);
        }
    }
}