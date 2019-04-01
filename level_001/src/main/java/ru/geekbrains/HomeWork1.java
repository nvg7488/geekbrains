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
}