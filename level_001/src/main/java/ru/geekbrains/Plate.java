package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void incFood(int f) {
        food += f;
    }
    public boolean decFood(int f) {
        boolean result = false;
        food -= f;
        if (food > 0) {
            result = true;
        } else {
            food += f;
        }
        return result;
    }
}
