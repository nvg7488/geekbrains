package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork6 {
    private Kater kater = new Kater();
    private Hund hund = new Hund();

    public void rennen(int num) {
        if (kater.rennenBln(num)) {
            System.out.println("\tКот пробежит\n");
        } else {
            System.out.println("\tКот не пробежит\n");
        }
        if (hund.rennenBln(num)) {
            System.out.println("\tПёс пробежит\n");
        } else {
            System.out.println("\tПёс не пробежит\n");
        }
    }

    public void hupfen(int num) {
        if (kater.hupfenBln(num)) {
            System.out.println("\tКот перепрыгнет\n");
        } else {
            System.out.println("\tКот не перепрыгнет\n");
        }
        if (hund.hupfenBln(num)) {
            System.out.println("\tПёс перепрыгнет\n");
        } else {
            System.out.println("\tПёс не перепрыгнет\n");
        }
    }

    public void schwimmen(int num) {
        if (kater.schwimmenBln(num)) {
            System.out.println("\tКот проплывёт\n");
        } else {
            System.out.println("\tКот не проплывёт\n");
        }
        if (hund.schwimmenBln(num)) {
            System.out.println("\tПёс проплывёт\n");
        } else {
            System.out.println("\tПёс не проплывёт\n");
        }
    }
}
