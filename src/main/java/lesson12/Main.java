package lesson12;


import lesson12.exceptions.MyArrayDataException;
import lesson12.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arrSize = {
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
        };

        String[][] dataArrExp = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "T"},
        };

        String[][] strToInt = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][][] matrices = {dataArrExp, arrSize, strToInt};
        for (String[][] matrix : matrices) {
            try {
                MyArrayMethod.stringToIntArray(matrix);
            } catch (MyArraySizeException | MyArrayDataException e){
                System.err.println(e);
            }
        }
    }
}
