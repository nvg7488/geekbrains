package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.Arrays;
import java.util.Random;
public class HomeWork1 {
    private float x1, x2;
    private int dev;
    public int[] random = new int[100];
    private static final Random RND = new Random();
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
     * Ввести возраст человека и определить, какое слово последует: "год", "года", "лет".
     * @param year возраст
     * @return result
     */
    public String task06(int year) {
        String result;
        if ((year % 10) == 0) {
            result = "лет";
        } else if ((year % 10) == 1) {
            result = "год";
        } else if ((year % 10) < 5) {
            result = "года";
        } else {
            result = "лет";
        }
        return result;
    }

    /**
     * Требуется определить, относятся ли поля к одному цвету.
     * @param x0
     * @param y0
     * @param x1
     * @param y1
     * @return boolean
     */
    public boolean task07(int x0, int y0, int x1, int y1) {
        boolean result = false;
        XYcolor[] figure = new XYcolor[2];
        figure[0] = new XYcolor(x0, y0);
        figure[1] = new XYcolor(x1, y1);
        if (figure[0].getColor() == figure[1].getColor()) {
            result = true;
        }
        return result;
    }

    /**
     * Ввести a и b и вывести квадраты и кубы чисел от a и b.
     * @param a "от".
     * @param b "до".
     * @return целочисленный массив квадратов и кубов.
     */
    public int[][] task08(int a, int b) {
        int[][] result = new int[2][b - a + 1];
        for (int index = 0, step = a; step <= b; index++, step++) {
            result[0][index] = step * step;
            result[1][index] = result[0][index] * step;
        }
        return result;
    }

    /**
     * Используя только операции сложения и вычитания,
     * найти частное от деления нацело N на M, а так же остаток от этого деления.
     * @param n
     * @param m
     * @return int
     */
    public int task09(int n, int m) {
        int result = 0;
        while (n >= m) {
            n -= m;
            result++;
        }
        this.dev = n;
        return result;
    }
    public int getDev() {
        return this.dev;
    }

    /**
     * С помощью операции деления нацело и взятия остатка от деления определить,
     * имеются ли в записи числа N нечётные цифры.
     * @param num
     * @return
     */
    public boolean task10(int num) {
        boolean result = false;
        int n;
        do {
            n = num % 10;
            num -= n;
            num /= 10;
            n %= 2;
            if (n > 0) {
                result = true;
            }
        } while (num > 0);
        return result;
    }

    /**
     * Подсчитать среднее арифметическое всех положительных чисел, оканчивающихся на "8".
     * @return int
     */
    public int task11() {
        int result = 0;
        int num;        //  random
        int dev;        //  остаток == 8
        int kol = 0;    //  iterator
        do {
            num = RND.nextInt();
            dev = num;
            do {
                dev %= 10;
            } while (dev > 10);
            if (dev == 8) {
                result += num;
                kol++;
            }
        } while (num > 0);
        if (kol > 0) {
            result /= kol;
            this.dev = result;
        } else {
            result = 0;
        }
        return result;
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

    /**
     * Генерация случайных число от 1 до 100 без использования стандартной функции rand().
     * @return
     */
    public int[] task13() {
        int[] result = new int[100];
        result[0] = 1;
        for (int index = 1; index < 100; index++) {
            random[index] = (2 * random[index - 1] + 3) % 100;
        }
        random = Arrays.copyOf(result, result.length);
        return result;
    }

    /**
     * Натуральное число называется автоморфным, если оно равно последним цифрам своего квадрата.
     * Например, 5^2 = 25.
     * @param num
     * @return boolean
     */
    public boolean test14(int num) {
        boolean result = false;
        int automorph = num * num;
        do {
            automorph %= 10;
            if (automorph == num) {
                result = true;
                break;
            }
        } while (automorph == num);
        return result;
    }
}