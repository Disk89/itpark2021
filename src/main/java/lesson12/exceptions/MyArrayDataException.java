package lesson12.exceptions;

public class MyArrayDataException extends RuntimeException{
    private int row;
    private int column;
    private String data;

    public MyArrayDataException(){}

    public MyArrayDataException(int row, int column, String data){
        super("Column " + column + ", row " + row + ", not valid data " + data + "!");
        this.row = row;
        this.column = column;
        this.data = data;
    };

}
