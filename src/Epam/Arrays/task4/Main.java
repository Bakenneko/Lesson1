//package Epam.Arrays.task4;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//import static Epam.Arrays.task4.FunctionsTask2.isSorted;
//import static Epam.Arrays.task4.FunctionsTask2.transform;
//
//public class Main {
//
//    private static final String MESSAGE_INPUT_ARRAY_SIZE = "Choose array size: \n n = ";
//    private static final String MESSAGE_INPUT_ARRAY_ELEMENT = "array[%s] = ";
//    private static final String MESSAGE_INPUT_SORT_ORDER = "SortOrder is ASCENDING => input figure \"1\", " +
//            "SortOrder is DESCENDING => input figure \"2\"\n";
//    private static final String MESSAGE_CONTINUE = "Continue? yes => input figure \"1\", " +
//            "\n\tno => input any figure more then \"1\"";
//    private static final String MESSAGE_ARRAY_IS_SORTED = "!!!RESULT!!! Array is sorted => %s \n\n";
//
//    private static final Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int[] array = getArray();
//
//        System.out.println("\n=>Tasks 2<=");
//        do {
//            int[] transformedArray = transform(array, getSortOrder());
//            System.out.println(Arrays.toString(transformedArray));
//            boolean sorted = isSorted(transformedArray, getSortOrder());
//            System.out.printf(MESSAGE_ARRAY_IS_SORTED, sorted ? "true" : "false");
//        } while (getContinue());
//    }
//
//    private static int[] getArray() {
//        System.out.print(MESSAGE_INPUT_ARRAY_SIZE);
//        int n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.printf(MESSAGE_INPUT_ARRAY_ELEMENT, i);
//            array[i] = input.nextInt();
//        }
//        return array;
//    }
//
//    private static SortOrder getSortOrder() {
//        System.out.print(MESSAGE_INPUT_SORT_ORDER);
//        int sortOrder = input.nextInt();
//        return switch (sortOrder) {
//            case 1 -> SortOrder.ASC;
//            case 2 -> SortOrder.DESC;
//            default -> getSortOrder();
//        };
//    }
//
//    private static boolean getContinue() {
//        System.out.println(MESSAGE_CONTINUE);
//        int answer = input.nextInt();
//        return answer == 1;
//    }
//}
