package Homework2.task2.PC;

//Створити та описати наступну їєрархію
//PC-Laptop-Ultrabook
//PC-Laptop- Workstation
//Загальна кількість вкористаних класів - 4!
//
//Cтворити клас ланцюг наслідування:
//Папірус-Кинга-Журнал
//Папірус-Книга-Комікс
//Кількість полів довільна.

import Homework2.task2.Laptop.Battery;
import Homework2.task2.Laptop.Laptop;
import Homework2.task2.Laptop.WiFi;
import Homework2.task2.Laptop.WifiType;
import Homework2.task2.Ultrabook.BodyType;
import Homework2.task2.Ultrabook.MotherBoard_Type;
import Homework2.task2.Ultrabook.Ultrabook;

public class Main {

    public static void main(String[] args) {

        PC pc = new PC(
                new Processor(123,1231,"i119"),
                new Monitor("Acer", 24.5),
                new Ram(2341,Type.DDR5));

        Laptop laptop = new Laptop(
                new Processor(258,321,"i-core6"),
                new Monitor("ASUS",24.5),
                new Ram(2500,Type.DDR4),
                new WiFi("hooks", WifiType.TYPE_5Hz),
                new Battery(646,"Duracell"));

        Ultrabook ultrabook = new Ultrabook(
                new Processor(259,221,""),
                new Monitor("Asus",23.5),
                new Ram(3000,Type.DDR4),
                new WiFi("758",WifiType.TYPE_5Hz),
                new Battery(500,"MSI"),
                BodyType.TITANIUM,
                MotherBoard_Type.UNIBODY
        );
        System.out.println(pc);
        System.out.println(laptop);
        System.out.println(ultrabook);
    }
}
