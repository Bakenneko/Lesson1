package Homework2.task2.Ultrabook;

import Homework2.task2.Laptop.Battery;
import Homework2.task2.Laptop.Laptop;
import Homework2.task2.Laptop.WiFi;
import Homework2.task2.PC.Monitor;
import Homework2.task2.PC.Processor;
import Homework2.task2.PC.Ram;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Ultrabook extends Laptop {

    private BodyType bodyType;

    private MotherBoard_Type motherBoardType;

    public Ultrabook(Processor processor, Monitor monitor, Ram ram, WiFi wiFi, Battery battery, BodyType bodyType, MotherBoard_Type motherBoardType) {
        super(processor, monitor, ram, wiFi, battery);
        this.bodyType = bodyType;
        this.motherBoardType = motherBoardType;
    }
}
