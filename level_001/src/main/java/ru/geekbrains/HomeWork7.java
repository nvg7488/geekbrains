package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork7 {
    private int kol = 9;
    private int full = 0;
    Kater[] kater = new Kater[kol];
    Plate plate = new Plate(108);

    public void init() {
        for (int i = 0; i < kol; i++) {
            int d = i + 1;
            String s = "Котяра №" + d;
            kater[i] = new Kater(s, 16);
            if (kater[i].eat(plate)) {
                ++full;
            }
        }
//        plate.info();
//        System.out.println("Сытых котов: " + full);
//        kol -= full;
//        System.out.println("Голодных котов: " + kol);
//        plate.incFood(36);
//        plate.info();
    }

    public int gesattigt() {    //  sätt
        return this.full;
    }
    public int hungrig() {
        return this.kol - this.full;
    }
}
