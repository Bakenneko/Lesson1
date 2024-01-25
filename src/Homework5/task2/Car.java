package Homework5.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Car {
    private String producer;
    private int power;

    private int price;

    private int year;

    private Driver driver;
}
