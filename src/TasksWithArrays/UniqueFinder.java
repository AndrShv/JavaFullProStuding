package TasksWithArrays;

import java.util.Arrays;

public class UniqueFinder {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 5, 6};
        int[] uniqueArray = new int[array.length];
        int uniqueIndex = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[uniqueIndex] = array[i];
                uniqueIndex++;
            }
        }
        System.out.println(Arrays.toString(uniqueArray));
    }
}
