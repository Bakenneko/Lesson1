package Epam.Function;

public class Result {

    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <=0) {
            throw new IllegalArgumentException("Number is negative!");
        }

        int multiplication = 1;
        for (int i = 0; i < n; i++) {
            multiplication *= a1 + i * t;
        }

        return multiplication;
    }
}