//Створити клас котрий відповідає наступній моделі
//{
//id: 1,
//name: 'Basil',
//surname: 'Jack',
//email: 'asd@asd.com',
//age: 31,
//gender: 'MALE',
//skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//car: {model: 'toyota', year: 2021, power: 250}
//}
//Використати композицію/агрегацію та енуми в потрібному місці.

package Homework2.task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java",15));

        User user = new User(10,
                "Basil",
                "Jackson",
                "basil@gmail.com",
                25,
                Gender.MALE,
                skills,
                new Car("BMW",
                        1500,
                        3.0,
                        true));
    }
}
