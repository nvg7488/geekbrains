package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.Random;
public class Course {
    private Random rand = new Random();
    private int[] pause = new int[5];
    private int index;

    public Course() {
        index = 0;
        for (int i = 0; i < 5; i++) {
            pause [i] = rand.nextInt(25);
            index += pause [i];
        }
    }
    public void start(Team team) {
        team.decUnit(index);
    }
}