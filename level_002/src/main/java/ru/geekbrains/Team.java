package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.Random;
public class Team {
    private Random rand = new Random();
    private String name;
    private int[] unit = new int[4];

    public Team(String str) {
        this.name = str;
        for (int i = 1; i < 4; i++) {
            unit[i] = rand.nextInt(50);
            unit[i] += 50;
        }
    }
    public void decUnit(int pause) {
        for (int i = 0; i < 4; i++) {
            unit[i] -= pause;
        }
    }

//    public void result() {
//        int n;
//        System.out.println("Прошли полосу:");
//        for (int i = 0; i < 4; i++) {
//            if (unit[i] > 0) {
//                System.out.println("\t" + i + "-й");
//            }
//        }
//    }

    public int[] getUnit() {
        return unit;
    }
}