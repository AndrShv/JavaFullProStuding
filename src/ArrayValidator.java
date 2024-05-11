public class ArrayValidator {
    public static void validateSize(String[][] arr) throws ArraySizeException {
        int expectedLength = 4;

        if (arr.length != expectedLength) {
            throw new ArraySizeException("Array size does not match expected size");
        }
    }
}
