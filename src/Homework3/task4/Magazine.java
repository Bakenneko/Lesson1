package Homework3.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class Magazine implements Printable{

    private final String title;
    private final int issueNumber;



    @Override
    public void print() {
        System.out.println("Magazine: " + title + ", Issue № " + issueNumber);
    }
}
