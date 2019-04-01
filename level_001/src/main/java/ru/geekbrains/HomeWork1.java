package ru.geekbrains;
import java.util.Scanner;
public class HomeWork1 {
    private byte b;
    private short s;
    private int i;
    private double d;
    private char ch;
    private String str;

    private int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1: Переменные всех пройденных типов данных.");
        System.out.println(" 2: return a * (b + (c / d));");
        System.out.println(" 3: Сумма чисел в диапазоне.");
        System.out.println(" 5: Отрицательное число.");
        System.out.print(" 0: выход из программы:");
        return sc.nextInt();
    }

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
}