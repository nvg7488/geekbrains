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
}