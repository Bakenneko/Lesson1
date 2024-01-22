//package HomeWork4.task2;
//
////Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//// В зооклубі створити методи, та застосувати їх
////6) вивести на екран зооклуб.
////Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
////Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку*/
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Person person1 = new Person(1,new ArrayList<>());
//        Person person2 = new Person(2, new ArrayList<>());
//        Person person3 = new Person(3, new ArrayList<>());
//
//
//        Pet pet1 = new Pet(1, "Buddy");
//        Pet pet2 = new Pet(2, "Whiskers");
//        Pet pet3 = new Pet(3, "Tweet");
//
//        Zoo zoo = new Zoo();
//
//        person1.getPets().add(pet1);
//        person2.getPets().add(pet2);
//        person3.getPets().add(pet3);
//
//        zoo.addPersonPet(person1, person1.getPets());
//        zoo.addPersonPet(person2, person2.getPets());
//        zoo.addPersonPet(person3, person3.getPets());
//
//        zoo.addPetToPerson(new Pet(4,"Nemo"),person1);
//        displayZooState(zoo);
//
//    }
//
//    private static void displayZooState(Zoo zoo) {
//        System.out.println("Zoo State:");
//        for (Map.Entry<Person, List<Pet>> entry : zoo.getClub().entrySet()) {
//            Person person = entry.getKey();
//            List<Pet> pets = entry.getValue();
//
//            System.out.println("Person ID: " + person.getId() + "'s Pets:");
//
//            for (Pet pet : pets) {
//                System.out.println(" - " + pet.getId() + ": " + pet.getName());
//            }
//        }
//    }
//}
