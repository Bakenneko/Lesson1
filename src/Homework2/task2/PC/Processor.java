package Homework2.task2.PC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Processor {

    private int clock;
    private int freq;
    private String model;

}
