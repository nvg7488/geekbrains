package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class Kater extends Biest {
    private String name;
    private int appetit;
    private boolean full;

    public Kater() {
        this.rennen = 200;
        this.hupfen = 2.0f;
        this.schwimmen = 0;
    }	//	конструктор по ДЗ 6
    public Kater(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.full = false;
    }	//	конструктор по ДЗ 7

    public boolean eat(Plate plate) {
        if (plate.decFood(this.appetit)) {
            this.full = true;
        }
        return this.full;
    }
}