//package HomeWork4.task2;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.*;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//
//public class Zoo {
//
//    private Map<Person, List<Pet>> club = new HashMap<>();
//
//    private void checkPerson(Person person){
//        if ( person == null) {
//            throw new RuntimeException("Person can't be null");
//        }
//    }
//    private void checkPet(Pet pet){
//        if (pet == null) {
//            throw new RuntimeException("Pet can't be null");
//        }
//    }
//    private void checkPet(List<Pet> pets){
//        if (pets == null) {
//            throw new RuntimeException("Pet can't be null");
//        }
//    }
//    //1) додати учасника в клуб;
//    public void addPersonPet (Person person, List<Pet> pets){
//        checkPerson(person);
//        checkPet(pets);
//        this.club.put(person,pets);
//    }
//    //2) додати тваринку до учасника клубу.
//    public void addPetToPerson(Pet pet,Person person){
//        checkPerson(person);
//        checkPet(pet);
//        this.club.get(person).add(pet);
//    }
//    //3) видалити тваринку з власника.
//    public void deletePetFromPerson(Pet pet,Person person){
//        checkPerson(person);
//        checkPet(pet);
//        this.club.get(person).remove(pet);
//    }
//
//    //4) видалити учасника клубу.
//    public void deletePerson(Person person){
//        checkPerson(person);
//        this.club.remove(person);
//    }
//    //5) видалити конкретну тваринку з усіх власників.
//    public void deleteFromAnybody(Pet pet){
//        checkPet(pet);
//        Set<Map.Entry<Person,List<Pet>>> entries = this.club.entrySet();
//
//        Iterator<Map.Entry<Person,List<Pet>>>iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Person,List<Pet>> next = iterator.next();
//            List<Pet> pets = next.getValue();
//            for (Pet pet1 : pets) {
//                if (pet1.equals(pet)) {
//                    iterator.remove();
//                }
//            }
//        }
//    }
//}
