package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class Person {
    //  Создать класс "Сотрудник" с полями ФИО, должность, e-mail, телефон, зарплата, возраст.
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;
    private int salary;

    //  Конструктор класса должен заполнять эти поля при создании объекта.
    public Person() {
        this.name = "Николай Говорухин";
        this.position = "программист Java";
        this.email = "e@mail.ru";
        this.phone = "8-987-654-3210";
        this.salary = 175;
        this.age = 37;
    }
    public Person(String name, String position, String email, String phone, int age, int salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //  Внутри класса "Сотрудник" написать метод, который выводит информацию об объекте.
    public String printPerson() {
        String person = this.name;
        person.concat(": ");
        person.concat(this.position);
        person.concat("\n\t");
        person.concat(this.email);
        person.concat("\n\t");
        person.concat(this.phone);
        person.concat("\n\t");
        person.concat(String.valueOf(this.age));
        person.concat(" лет\n\t");
        person.concat(String.valueOf(this.salary));
        person.concat(" т.р.\n");
        return person;
    }
    public int getAge() {
        return age;
    }
}
