package geekbrains.ru;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String [][] arr) {
        super("Incorrect String Index");

    }
}
