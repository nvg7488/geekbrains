package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork6 {
    private Kater kater = new Kater();
    private Hund hund = new Hund();

    public void rennen(int num) {
        if (kater.rennenBln(num)) {
            System.out.println("\tКот пробежит");
        } else {
            System.out.println("\tКот не пробежит");
        }
        if (hund.rennenBln(num)) {
            System.out.println("\tПёс пробежит\n");
        } else {
            System.out.println("\tПёс не пробежит\n");
        }
    }

    public void hupfen(float num) {
        if (kater.hupfenBln(num)) {
            System.out.println("\tКот перепрыгнет");
        } else {
            System.out.println("\tКот не перепрыгнет");
        }
        if (hund.hupfenBln(num)) {
            System.out.println("\tПёс перепрыгнет\n");
        } else {
            System.out.println("\tПёс не перепрыгнет\n");
        }
    }

    public void schwimmen(int num) {
        if (kater.schwimmenBln(num)) {
            System.out.println("\tКот проплывёт");
        } else {
            System.out.println("\tКот не проплывёт");
        }
        if (hund.schwimmenBln(num)) {
            System.out.println("\tПёс проплывёт\n");
        } else {
            System.out.println("\tПёс не проплывёт\n");
        }
    }
}
