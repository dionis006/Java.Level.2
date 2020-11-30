import java.util.Arrays;
import java.util.Random;

public class MyArray {

    public String[][] doArray(int size) {
        String[][] myArray = creatingArray(size);
        return myArray;

    }

    public String[][] creatingArray(int size) {
        Random random = new Random();
        String[][] array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(random.nextInt(6));
            }
        }
        return array;
    }

    public void doShowArray(String[][] array) {
        for (int i = 0; i < array.length; i++) System.out.println(Arrays.toString(array[i]));
    }

    public void doSumArray(String[][] array) {
        new ChekArray().ChekArraySize(array);
        doShowArray(array);
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                new ChekArray().ChekArrayData(array[i][j], i, j);
                result = result + Integer.parseInt(array[i][j]);
            }
        }
        System.out.println(result);
    }
}
