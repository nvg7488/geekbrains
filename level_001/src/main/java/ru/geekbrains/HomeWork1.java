package ru.geekbrains;
import java.util.Scanner;
public class HomeWork1 {
    private byte b;
    private short s;
    private int i;
    private double d;
    private char ch;
    private String str;

    /**
     * Создать переменные всех пройденных типов данных и инициализировать их значения.
     */
    public void task1() {
        this.b = 1;
        this.s = 2;
        this.i = s * s;
        this.d = b / 75;
        this.ch = ' ';
        this.str = "a*(b+(c/d)) = ";
    }

    /**
     * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – входные параметры этого метода.
     * @param a
     * @param b
     * @param c
     * @param d
     * @return int
     */
    public int task2(int a, int b, int c, int d) {
        return (a * (b + c / d));
    }

    /**
     * Написать метод, принимающий на вход два числа,
     * и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
     * если да – вернуть true, в противном случае – false.
     * @param x
     * @param y
     * @return boolean
     */
    public boolean task3(int x, int y) {
        boolean result;
        int z = x + y;
        if ((z >= 10) && (z < 21)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль положительное ли число передали, или отрицательное.
     * Замечание: ноль считаем положительным числом.
     * @param number
     * @return boolean
     */
    public boolean task4(int number) {
        boolean result = true;
        if (task5(number)) {
            result = false;
        }
        return result;
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен вернуть true, если число отрицательное.
     * @param number
     * @return boolean
     */
    public boolean task5(int number) {
        boolean result = false;
        if (number < 0) {
            result = true;
        }
        return result;
    }

    /**
     * Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     * метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     * @param name
     * @return String
     */
    public String task6(String name) {
        return "Привет, " + name + "!";
    }

    /**
     * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     * @param year
     * @return boolean
     */
    public boolean task7(int year) {
        boolean result;
        if (((float) year) / 400 == (float) (year / 400)) {
            result = true;
        } else {
            if (((float) year) / 100 == (float) (year / 100)) {
                result = false;
            } else {
                if (((float) year) / 4 == (float) (year / 4)) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}