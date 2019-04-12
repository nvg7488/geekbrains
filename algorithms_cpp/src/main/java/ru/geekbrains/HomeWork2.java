package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.LinkedList;
public class HomeWork2 {
    private LinkedList binar = new LinkedList();
    private int kol = 0;
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

    /**
     * Реализовать функцию возведения числа a в степень b без рекурсии.
     * @param a
     * @param b
     * @return a^b
     */
    public int task2a(int a, int b) {
        int result = 1;
        for (int index = 0; index < b; index++) {
            result *= a;
        }
        return result;
    }

    /**
     * Реализовать функцию возведения числа a в степень b рекурсивно.
     * @param a
     * @param b
     * @return a^b
     */
    public int task2b(int a, int b) {
        int result;
        if (b == 1) {
            result = a;
        } else {
            result = a * task2b(a, b - 1);
        }
        return result;
    }

    /**
     * Реализовать функцию возведения числа a в степень b рекурсивно, используя свойство чётности степени.
     * @param a
     * @param b
     * @return a^b
     */
    public int task2c(int a, int b) {
        int result = 1;
        if (b == 1) {
            result = a;
        } else if (b % 2 > 0) {
            result = a * task2c(a, b - 1);
        } else {
            result = task2c(a, b / 2);
            result *= result;
        }
        return result;
    }

    /**
     * "Калькулятор" преобразует число 3 в 20, используя две команды: +1, *2.
     * Определить, сколько имеется вариантов преобразования с использованием рекурсии.
     * @param num
     */
    public void task3b(int num) {
        if (num == 20) {
            kol++;
        } else {
            if (num < 20) {
                task3b(num + 1);
            }
            if (num < 11) {
                task3b(num * 2);
            }
        }
    }
    public int getKol() {
        return kol;
    }
}