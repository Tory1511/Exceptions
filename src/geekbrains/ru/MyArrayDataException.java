package geekbrains.ru;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int i, int j)
    {
        super("Invalid type in x:" + (j + 1) + " y:" + (i + 1) );
    }
}
