package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        while (true) {
            System.out.println("Введите, размер массива");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size < 0) {
                    System.out.println("Вы ввели отрицательное число");
                    continue;
                }
                break;
            } else {
                System.out.println("Вы ввели не целое число");
                scanner.next();
            }
        }

        double[] arr = arrayGenerator(size);
        minElement(arr);
        maxElement(arr);
        avg(arr);


    }

    private static double[] arrayGenerator(int size) {
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static void avg(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("avg = " + (sum / arr.length));

    }

    private static void maxElement(double[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max value = " + max);
    }

    private static void minElement(double[] arr) {
        double min = 1;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min value = " + min);
    }
}
