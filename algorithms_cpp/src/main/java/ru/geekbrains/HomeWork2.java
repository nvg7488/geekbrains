package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork2 {
    /**
     * Реализовать функцию перевода из 10 системы в двоичную используя рекурсию.
     * @param desc
     * @return String binar
     */
    public String task1(int desc) {
        String binar = null;
        if (desc > 0) {
            binar.concat(String.valueOf(desc % 2));
            binar.concat(task1(desc / 2));
        }
        return binar;
    }
}
