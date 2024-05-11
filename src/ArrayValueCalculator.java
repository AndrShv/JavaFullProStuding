public class ArrayValueCalculator {

    public int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        ArrayValidator.validateSize(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at position (" + i + ", " + j + ")", e);
                }
            }
        }

        return sum;
    }
}
