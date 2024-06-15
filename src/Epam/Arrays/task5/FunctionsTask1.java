//package Epam.Arrays.task5;
//
//public class FunctionsTask1 {
//    public static boolean isSorted(int[] array, SortOrder order) {
//        if (array == null || order == null) {
//            throw new IllegalArgumentException("Array or sort order cannot be null");
//        }
//
//        for (int i = 1; i < array.length; i++) {
//            if (order == SortOrder.ASC) {
//                if (array[i] < array[i - 1]) {
//                    return false;
//                }
//            } else if (order == SortOrder.DESC) {
//                if (array[i] > array[i - 1]) {
//                    return false;
//                }
//            } else {
//                throw new UnsupportedOperationException("Unsupported sort order");
//            }
//        }
//
//        return true;
//    }
//}
