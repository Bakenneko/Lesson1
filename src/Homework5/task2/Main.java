package Homework5.task2;

//Створити клас автомобіля з полями:
//Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//Власник автомобіля поля Імя, вік, стаж водіння.
//Створити не менше 7 та не більше 20 машинок.
//Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//Все через stream API

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.stream()
                .limit(Math.round(cars.size() / 2))
                .peek(car -> car.setPower(car.getPower() + 10))
                .peek(car -> {
                    Driver driver = car.getDriver();
                    if (driver.getAge() > 25 && driver.getExp() < 1) {
                        driver.setExp(driver.getExp()+1);
                    }
                })
                .mapToDouble(car -> car.getPrice());
    }
}
