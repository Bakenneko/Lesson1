package Homework2.task2.Workstation;

import Homework2.task2.Laptop.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Workstation  extends Laptop {

    private Dock dock;

}
