package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork1 {
    private float x1, x2;
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
    public int[] task03a(int[] array) {
        int tmp;
        tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
        return array;
    }

    /**
     * Написать программу нахождения корней заданного квадратного уравнения.
     * @param a
     * @param b
     * @param c
     * @return количество корней
     */
    public int task04(int a, int b, int c) {
        int result = 0;
        int d = b * b - 4 * a * c;
        if (d == 0) {
            result = 1;
            this.x1 = -(b / (2 * a));
        } else if (d > 0) {
            result = 2;
            this.x1 = (float) Math.sqrt(c / a) - b;
            this.x1 /= 2 * a;
            this.x2 = (float) -(Math.sqrt(c / a) + b);
            this.x2 /= 2 * a;
        }
        return result;
    }
    public float getX1() {
        return this.x1;
    }
    public float getX2() {
        return this.x2;
    }

    /**
     * Передаётся номер месяца. Требуется определить, к какому времени года он относится.
     * @param mm месяц
     * @return season
     */
    public String task05(int mm) {
        String season;
        if ((mm < 3) || (mm == 12)) {
            season = "Зима";
        } else if (mm < 6) {
            season = "Весна";
        } else if (mm < 9) {
            season = "Лето";
        } else {
            season = "Осень";
        }
        return season;
    }

    /**
     * Найти максимальное из 3-х чисел.
     * @param a
     * @param b
     * @param c
     * @return max3
     */
    public int task12(int a, int b, int c) {
        return (max(a, b) > c) ? max(a, b) : c;
    }
}