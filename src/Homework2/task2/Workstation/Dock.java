package Homework2.task2.Workstation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Dock {

    private String brand;
    private ArrayList<Port> ports = new ArrayList<Port>();


}
