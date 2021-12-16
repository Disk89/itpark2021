package lesson12.exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{


    public MyArraySizeException() {}
    public MyArraySizeException(int index) {
        super(index + " - array size is not equals 4");
    }
}
