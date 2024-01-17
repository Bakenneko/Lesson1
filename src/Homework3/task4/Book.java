package Homework3.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data

public class Book implements Printable{

    private final String title;
    private final String author;

    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}
