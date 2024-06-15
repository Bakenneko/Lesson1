//package Epam.Arrays.task3;
//
//import java.util.Arrays;
//
//public class MatrixUtil {
//    public static void transformMatrix(int[][] matrix) {
//            if (matrix == null || matrix.length == 0) {
//                return;
//            }
//
//            int n = matrix.length;
//            int m = matrix[0].length;
//
//            // Check if the matrix is rectangular
//            for (int i = 1; i < n; i++) {
//                if (matrix[i].length != m) {
//                    throw new IllegalArgumentException("Input matrix is not rectangular");
//                }
//            }
//
//            // Check if any row is empty
//            for (int i = 0; i < n; i++) {
//                if (matrix[i].length == 0) {
//                    throw new IllegalArgumentException("Input matrix contains empty rows");
//                }
//            }
//
//            // Perform transformation
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (i < j) {
//                        matrix[i][j] = 1; // Write 1 to the right of the main diagonal
//                    } else if (i > j) {
//                        matrix[i][j] = 0; // Write 0 to the left of the main diagonal
//                    }
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//            {
//                int[][] matrix = null;
//
//                try {
//                    transformMatrix(matrix);
//                    System.out.println(Arrays.deepToString(matrix));
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Exception for null matrix: " + e.getMessage());
//                }
//            }
//            {
//                int[][] matrix = {};
//                try {
//                    transformMatrix(matrix);
//                    System.out.println(Arrays.deepToString(matrix));
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Exception for empty matrix: " + e.getMessage());
//                }
//            }
//            {
//                int[][] matrix = { {} };
//                try {
//                    transformMatrix(matrix);
//                    System.out.println(Arrays.deepToString(matrix));
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Exception for single empty row matrix: " + e.getMessage());
//                }
//            }
//            {
//                int[][] matrix = { {}, {} };
//                try {
//                    transformMatrix(matrix);
//                    System.out.println(Arrays.deepToString(matrix));
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Exception for two empty rows matrix: " + e.getMessage());
//                }
//            }
//            {
//                int[][] matrix = { { 2, 3 }, { 4, 5, 6 } };
//                try {
//                    transformMatrix(matrix);
//                    System.out.println(Arrays.deepToString(matrix));
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Exception for uneven matrix 1: " + e.getMessage());
//                }
//            }
//            {
//                int[][] matrix = { { 2, 3 }, { 4, 5 }, {} };
//                try {
//                    transformMatrix(matrix);
//                    System.out.println(Arrays.deepToString(matrix));
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Exception for uneven matrix 2: " + e.getMessage());
//                }
//            }
//            {
//                int[][] matrix = { { 2, 3 }, { 4, 5 } };
//                transformMatrix(matrix);
//                System.out.println(Arrays.deepToString(matrix));
//            }
//            {
//                int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 }, { 5, 7, 8, 5 } };
//                transformMatrix(matrix);
//                System.out.println(Arrays.deepToString(matrix));
//            }
//            {
//
//                int[][] matrix = { { 2, 3 }, { 4, 5 }, { 6, 7 } };
//                transformMatrix(matrix);
//                System.out.println(Arrays.deepToString(matrix));
//            }
//            {
//                int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 } };
//                try {
//                    transformMatrix(matrix);
//                    System.out.println(Arrays.deepToString(matrix));
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Exception for uneven large matrix: " + e.getMessage());
//                }
//            }
//
//        }
//
//    }
//
