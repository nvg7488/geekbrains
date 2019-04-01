package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork1 {
    private int max(int x, int y) {
        return (x > y) ? x : y;
    }

    /**
     * Ввести вес m в кг и рост h в метрах человека. Расчитать и вывести индекс массы тела по формуле I=m/(h*h).
     * @param m
     * @param h
     * @return index
     */
    public float task01(int m, float h) {
        return m / (h * h);
    }
    /**
     * Найти максимальное из 4-х чисел.
     * @param a
     * @param b
     * @param c
     * @param d
     * @return max
     */
    public int task02(int a, int b, int c, int d) {
        return (max(a, b) > max(c, d)) ? max(a, b) : max(c, d);
    }
    /**
     * Написать программу обмена значениями двух целочисленных переменных с использованием третьей переменной.
     * @param array
     * @return array
     */
}