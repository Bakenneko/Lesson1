//package School_ShPlus.threeNumbers;
////Напишіть функцію, яка приймає на вхід три числа, і повертає число 1,
//// якщо їх сума знаходиться в діапазоні від 0 до 100, інакше повертає найбільше серед них, або -1, якщо вони всі рівні.
//
//public class Main {
//
//    public static void main(String[] args) {
//        int result = actionsNumbers(10,10,10);
//        System.out.println(result);
//    }
//
//    public static int actionsNumbers (int a, int b, int c) {
//        int sum = a + b + c;
//        int maxNumber;
//
//        if (a == b && b == c) {
//            return -1;
//        } else if ( sum >=0 && sum <= 100){
//            return 1;
//        } else {
//
//            if (a > b && a > c) {
//                maxNumber = a;
//            } else if (b > a && b > c){
//                maxNumber = b;
//            } else {
//                maxNumber = c;
//            }
//        }
//        return maxNumber;
//    }
//}

//public class Main {
//public static void main(String[] args) {
//
//    int result = actionsNumbers(100,1010,10);
//        System.out.println(result);
//    }
//
//    public static int actionsNumbers(int a, int b, int c) {
//        int sum = a+b+c;
//
//        if (a == b && b == c){
//            return -1;
//        } else if (sum >= 0 && sum <=100 ) {
//            return 1;
//        } else {
//            return Math.max(Math.max(a,b),c);
//        }
//    }
//}


