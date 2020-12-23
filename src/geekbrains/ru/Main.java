package geekbrains.ru;

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.

public class Main {

    public static void main(String[] args) {
        String [][] arr  =
                {
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "5", "4"},
                };

        String [][] arrTestEx1  =
                {
                  {"1", "2", "3", "4"},
                  {"1", "2", "3", "4"},
                  {"1", "2", "3", "4"},
                  {"1", "2", "x", "4"},
                };

        String [][] arrTestEx2 =
                {
                  {"1", "2", "3", "4"},
                  {"1", "2", "3", "4"},
                  {"1", "2", "3", "4"},
                };

        try
        {
            sumArray(arrTestEx1);
        }
        catch (MyArraySizeException | MyArrayDataException e)
        {
            e.printStackTrace();
        }

        try
        {
            sumArray(arrTestEx2);
        }
        catch (MyArraySizeException | MyArrayDataException e)
        {
            e.printStackTrace();
        }

        try
        {
            System.out.println("Array sum: " + sumArray(arr));
        }
        catch (MyArraySizeException | MyArrayDataException e)
        {
            e.printStackTrace();
        }

    }


    public static int sumArray(String [][] arr ) throws MyArraySizeException, MyArrayDataException {
        int counter = 0;
        if (arr.length != 4 || arr[0].length != 4) throw new MyArraySizeException(arr); //"Incorrect String Index"
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                try
                {
                    counter = counter + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e)
                {
                    throw new MyArrayDataException(i, j);
                }

            }
            System.out.println();
        }

        return counter;

    }
}
