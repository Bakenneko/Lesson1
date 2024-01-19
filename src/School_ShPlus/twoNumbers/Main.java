package School_ShPlus.twoNumbers;

public class Main {

        public static void main(String[] args) {
            int result = actionsNumbers(1, 20);
            System.out.println("Сума: " + result);
        }

        public static int actionsNumbers(int a, int b) {
            int sum = 0;
            // Перевіряємо кожне число від a до b
            for (int i = a; i <= b; i++) {
                // Перевіряємо, чи число ділиться на 5 або на одне з введених чисел без остачі
                if (i % 5 == 0 || i % a == 0 || i % b == 0) {
                    sum += i; // Додаємо число до суми
                }
            }
            return sum;
        }
    }
