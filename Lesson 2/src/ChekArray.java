public class ChekArray {

    public boolean ChekArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException(String.format("Invalid array size. length: %s", array.length));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(String.format("Invalid array size. array[%s].length - %s", i, array[i].length));
            }
        }
        return true;
    }


    public void ChekArrayData(String array, int i, int j) throws MyArrayDataException {
        try {
            Integer.parseInt(array);
        } catch (NumberFormatException exception) {
            throw new MyArrayDataException(String.format("Invalid data on array[%s][%s]", i, j));
        }
    }

}
