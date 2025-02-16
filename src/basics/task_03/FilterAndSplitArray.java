package basics.task_03;

import java.util.Arrays;

public class FilterAndSplitArray {
    public static void main(String[] args) {
        int[] inputArray = {0, 3, 1, 0, 4, 2, 0, 5};
        int[][] result = processArray(inputArray);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] processArray(int[] array) {
        // Filter out zeros
        int[] filteredArray = Arrays.stream(array).filter(value -> value != 0).toArray();

        // Sort the array
        Arrays.sort(filteredArray);

        // Split into 2-dimensional array
        int length = filteredArray.length;
        int[][] twoDimArray = new int[2][(length + 1) / 2];

        for (int i = 0; i < length; i++) {
            twoDimArray[i % 2][i / 2] = filteredArray[i];
        }

        return twoDimArray;
    }
}