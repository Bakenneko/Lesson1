//package Homework5.task1;


//створити ArrayList зі словами на 15-20 елементів, відсортувати його за алфавітом .
//відфільтрувати слова довжиною менше 4 символів
//Створити масив з 20 числами, за допомогою способу sorted відсортувати масив.
// за допомогою filter отримати числа кратні 3
// за допомогою filter отримати числа кратні 10
// перебрати (проітерувати) масив за допомогою foreach()
// перебрати масив за допомогою map() і отримати новий масив,
// в якому всі значення будуть у 3 рази більші

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//
//        List<String> strings = new ArrayList<>();
//        List<String> collect = strings
//                .stream()
//                .sorted(Comparator.naturalOrder())
//                .filter(s -> s.length()<4)
//                .toList();
//
//        List<Integer> integers = new ArrayList<>();
//
//        integers
//                .stream()
//                .sorted()
//                .filter(integer -> integer%3==0)
//                .filter(integer -> integer%10==0)
//                .map(integer -> integer*3)
//                .forEach(System.out::println);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        List<String> strings = new ArrayList<>();
//        strings.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//    }
//}