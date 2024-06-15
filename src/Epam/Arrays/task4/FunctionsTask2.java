package Epam.Arrays.task4;

public class FunctionsTask2 {

    public static boolean isSorted(int[] array, SortOrder order) {

        if (array == null || order == null) {
            throw new IllegalArgumentException("Array or sort order cannot be null");
        }

        if (SortOrder.ASC.equals(order)) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    return false;
                }
            }
        } else if (SortOrder.DESC.equals(order)) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    return false;
                }
            }
        } else {
            throw new UnsupportedOperationException("Unsupported sort order");
        }

        return true;

    }

    public static int[] transform(int[] array, SortOrder order) {
        if (array == null || order == null) {
            throw new UnsupportedOperationException("Array or sort order cannot be null");
        }

        if (!isSorted(array, order)) {
            throw new UnsupportedOperationException("Array is not sorted in the specified order");
        }

        int[] transformedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            transformedArray[i] = array[i] + i;
        }

        return transformedArray;
    }

}