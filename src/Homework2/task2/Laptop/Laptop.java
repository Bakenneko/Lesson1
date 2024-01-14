package Homework2.task2.Laptop;

import Homework2.task2.PC.Monitor;
import Homework2.task2.PC.PC;
import Homework2.task2.PC.Processor;
import Homework2.task2.PC.Ram;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Laptop extends PC {

    private WiFi wiFi;
    private Battery battery;

    public Laptop(Processor processor, Monitor monitor, Ram ram, WiFi wiFi, Battery battery) {
        super(processor, monitor, ram);
        this.wiFi = wiFi;
        this.battery = battery;
    }
}
