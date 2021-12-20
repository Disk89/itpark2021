package lesson12;


import lesson12.exceptions.MyArrayDataException;
import lesson12.exceptions.MyArraySizeException;

public class MyArrayMethod {
    static final int INDEX = 4;

    public static int stringToIntArray(String[][] arr) {
        int sum = 0;
        checkSize(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, arr[i][j]);
                }
            }
        }
        System.out.println("Sum elements = " + sum);
        return sum;
    }

    private static void checkSize(String[][] arr) {
        if (arr.length != INDEX) {
            throw new MyArraySizeException(arr.length);
        }
        for (String[] arg : arr) {
            if (arg.length != INDEX) {
                throw new MyArraySizeException(arg.length);
            }
        }
    }
}
