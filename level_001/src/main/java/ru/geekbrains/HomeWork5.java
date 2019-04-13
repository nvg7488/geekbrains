package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.List;
import java.util.ArrayList;
public class HomeWork5 {
    private Person[] person = new Person[5];

    //  Создать массив из 5 сотрудников.
    public void array() {
        person[0] = new Person();
        person[1] = new Person("Иванов", "программист Java",
                "e@mail.ru", "8-987-654-3210", 41, 125);
        person[2] = new Person("Петров", "программист C#",
                "e@mail.ru", "8-987-654-3210", 45, 100);
        person[3] = new Person("Говорухина", "web-дизайнер",
                "e@mail.ru", "8-987-654-3210", 28, 75);
        person[4] = new Person("Сидоров", "web-дизайнер",
                "e@mail.ru", "8-987-654-3210", 79, 50);
    }
    public Person[] getPerson() {
        return person;
    }

    //  С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public List<Person> ages(int age) {
        List<Person> result = new ArrayList<>();
        for (Person pers : person) {
            if (pers.getAge() >= age) {
                result.add(pers);
            }
        }
        return result;
    }
}