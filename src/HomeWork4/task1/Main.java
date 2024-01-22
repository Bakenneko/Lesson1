//package HomeWork4.task1;
//
///*
//
//створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .
//
//Створити клас котрий відповідає наступній моделі
//{
//    id: 1,
//    name: 'Basil',
//    surname: 'Jackson',
//    email: 'asd@asd.com',
//    age: 31,
//    gender: 'MALE',
//    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//    car: {model: 'toyota', year: 2021, power: 250}
//}
//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
//
//Створити List Юзерів
//- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Main {
//    public static void main(String[] args) {
//
//        User user = new User(1, "Tom", new Skill("Java",10), new Skill("SQL",10));
//        System.out.println(user);
//
//        Set<User> users = new TreeSet<>();
//        users.add(new User(1,"Anna",new Skill("Python",9),new Skill("MongoDB",9),new Skill("PhP",11),new Skill("PhP",11)));
//        users.add(new User(2,"Dina",new Skill("PhP",11)));
//        users.add(new User(3,"Helga",new Skill("Python",9),new Skill("SQL",9)));
//        users.add(new User(4,"Mika",new Skill("Python",9),new Skill("MongoDB",9),new Skill("PhP",11)));
//
//        users.forEach(System.out::println);
//    }
//}
