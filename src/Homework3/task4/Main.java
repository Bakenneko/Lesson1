package Homework3.task4;

//г) Створити масив типу Printable, який буде містити книги та журнали.
public class Main {
    public static void main(String[] args) {

        Printable[] printables = new Printable[3];
        printables[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        printables[1] = new Magazine("National Geographic", 150);
        printables[2] = new Book("To Kill a Mockingbird", "Harper Lee");
            for (Printable printable : printables) {
                printable.print();
            }
    }
}
