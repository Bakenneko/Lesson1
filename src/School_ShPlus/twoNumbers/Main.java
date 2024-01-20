package School_ShPlus.twoNumbers;

public class Main {

    public static void main(String[] args) {

        int result = actionsNumbers(3, 20);
        System.out.println("Сума: " + result);
    }

    public static int actionsNumbers(int a, int b) {
        int sum = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start+1; i < end; i++) {

            if (i % 5 == 0 || i % a == 0 || i % b == 0) {
                sum += i;
            }

        }
        return sum;
    }
}

