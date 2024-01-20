//package School_ShPlus.funckArrays;

//Напишіть функцію, яка приймає на вхід два масива однакової довжини + параметр,
// який описує їх довжину; і модифікує їх таким чином, що в першому масиві в кожній i-тій комірці знаходиться різниця
// цієї комірки і відповідної i-тої комірки другого масиву,
// а в другому масиві в кожній i-тій комірці знаходиться сума цієї комірки і відповідної i-тої комірки першого масиву.

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3, 4, 1};
//        int[] array2 = {5, 6, 7, 8,};
//        int length = Math.min(array1.length, array2.length);
//        modifyArrays(array1, array2, length);
//        System.out.println("Modified Array1: " + Arrays.toString(array1) + " Modified Array2: " + Arrays.toString(array2));
//    }
//
//    public static void modifyArrays(int[] array1, int[] array2, int length) {
//        for (int i = 0; i < length; i++) {
//            array1[i] = array1[i] - array2[i];
//            array2[i] = array1[i] + array2[i];
//        }
//    }
//}

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array1 = {10,11,12,13,5,7,8};
//        int[] array2 = {13,14,15,16,7};
//        int length = Math.min(array1.length,array2.length);
//        modifyArrays(array1,array2,length);
//        System.out.println("Модифікований масив 1: " + Arrays.toString(array1));
//        System.out.println("Модифікований масив 2: " + Arrays.toString(array2));
//
//    }
//
//    public static void modifyArrays (int[] array1, int[] array2, int length) {
//
//        for (int i = 0; i < length; i++) {
//            array1[i] = array1[i] - array2[i];
//            array2[i] = array1[i] + array2[i];
//        }
//
//    }
//}


