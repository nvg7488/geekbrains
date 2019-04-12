package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.LinkedList;
public class HomeWork2 {
    private LinkedList binar = new LinkedList();
    /**
     * Реализовать функцию перевода из 10 системы в двоичную используя рекурсию.
     * @param desc
     * @return String binar
     */
    public LinkedList task1(int desc) {
        binar.add(desc % 2);
        if (desc / 2 > 0) {
            task1(desc / 2);
        }
        return binar;
    }
}
