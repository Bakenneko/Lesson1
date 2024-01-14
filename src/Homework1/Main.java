//package Homework1;
//
//import lombok.ToString;
//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//
//        ArrayList<Book> books = new ArrayList<>();
//
//        String [] authors1 = {"Jonathan Swift","George Orwell","Miguel de Cervantes"};
//        String [] authors2 = {"Jonathan Swift","George Orwell","Miguel de Cervantes"};
//        String [] authors3 = {"Jonathan Swift","George Orwell","Miguel de Cervantes"};
//
//        books.add(new Book("Gulliver's Travels",200,"Satire", new String[]{"Jonathan Swift","George Orwell","Miguel de Cervantes"}));
//        books.add(new Book("Nineteen Eighty-Fours",300,"Utopian", authors2));
//        books.add(new Book("Don Quijote De La Manchas",400,"Novel", authors3));
//
//        for (Book book : books) {
//            System.out.println(book);
//        }
//
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(new Car("Toyota",200,2.0,true));
//        cars.add(new Car("Audi",300,3.0,false));
//        cars.add(new Car("BMW",500,4.0,true));
//        for (Car car : cars){
//            System.out.println(car);
//        }
//
//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog("Dog",2,"Mops"));
//        dogs.add(new Dog("Nick",3,"Bill"));
//        dogs.add(new Dog("Jack",4,"Jill"));
//
//        for (Dog dog : dogs) {
//            System.out.println(dog);
//
//        }
//    }
//}
