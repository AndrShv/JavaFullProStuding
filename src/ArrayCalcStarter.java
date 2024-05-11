public class ArrayCalcStarter {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] arr = {
                {"1", "2", "3", "%", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = calculator.doCalc(arr);
            System.out.println("Result: " + result);
        } catch (ArraySizeException e) {
            System.err.println("Array size exception: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.err.println("Array data exception: " + e.getMessage());
            if (e.getCause() != null) {
                System.err.println("Caused by: " + e.getCause().getMessage());
            }
        }
    }
}

