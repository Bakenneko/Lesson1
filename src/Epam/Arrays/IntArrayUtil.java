//package Epam.Arrays;
//
//public class IntArrayUtil {
//
//    public static void swapEven(int[] array) {
//
//        if (array == null || array.length == 0) {
//            return;
//        }
//
//
//        int n = array.length;
//        for (int i = 0; i < n / 2; i++) {
//            int j = n - 1 - i;
//            if (array[i] % 2 == 0 && array[j] % 2 == 0) {
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//
//            }
//        }
//    }
//
//}