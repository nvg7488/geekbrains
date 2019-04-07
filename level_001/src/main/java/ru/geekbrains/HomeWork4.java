package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.*;
public class HomeWork4 {
    private static int size = 5;
    private static int dots = 4;
    private static char[][] map = new char[size][size];
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                map[x][y] = '*';
            }
        }
        printPole();
        while (true) {
            stepMen();
            printPole();
            if (check('X')) {
                System.out.println("Ходит gamer!");
                break;
            }
            stepRnd();
            printPole();
            if (check('O')) {
                System.out.println("Ходит программа!");
                break;
            }
        }
        System.out.println("\n\tИгра завершена.");
    }

    private static void printPole() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int x = 0; x < size; x++) {
            System.out.print((x + 1) + " ");
            for (int y = 0; y < size; y++) {
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
        boolean bln = true;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (map[x][y] == '*') {
                    bln = false;
                }
            }
        }
        if (bln) {
            System.out.println("Играем ещё?.");
        }
    }
    private static void stepRnd() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!xy(x, y));
        map [x][y] = 'O';
        System.out.println("Программа походила: " + (x + 1) + "x" + (y + 1));
    }
    private static void stepMen() {
        int x, y;
        do {
            System.out.println("\nХод игрока:");
            System.out.print("\tX: ");
            x = sc.nextInt() - 1;
            System.out.print("\tY: ");
            y = sc.nextInt() - 1;
        } while (!xy(x, y));
        map [x][y] = 'X';
    }
    private static boolean xy(int x, int y) {
        boolean result;
        if (x < 0 || x > size || y < 0 || y > size)	{
            result = false;
        } else if (map [x][y] == '*') {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    private static boolean check(char ch) {
        boolean result = false;
        int x, y, z = size - dots;
        for (x = 0; x < 2; x++) {
            for (y = 0; y < size; y++) {
                if (blnDots(x, y, 1, 0, ch)) {
                    result = true;
                    break;
                }
            }
        }
        for (y = 0; y < 2; y++) {
            for (x = 0; x < size; x++) {
                if (blnDots(x, y, 0, 1, ch)) {
                    result = true;
                    break;
                }
            }
        }
        for (x = 0; x <= z; x++) {
            for (y = 0; y <= z; y++) {
                if (dgnDots(x, y, 1, ch)) {
                    result = true;
                    break;
                }
            }
        }
        for (x = dots - 1; x < size; x++) {
            for (y = 0; y <= z; y++) {
                if (dgnDots(x, y, -1, ch)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    private static boolean blnDots(int x, int y, int dx, int dy, char ch) {
        int i, j, xd, yd;
        boolean bln = true;
        if (dx == 0) {
            xd = x;
        } else {
            xd = x + dots;
        }
        if (dy == 0) {
            yd = y;
        } else {
            yd = y + dots;
        }
        i = x; do {
            j = y; do {
                if (map [x][y] != ch) {
                    bln = false;
                }
                x += dx;
                y += dy;
                j++;
            } while (j < yd);
            i++;
        } while (i < xd);
        return bln;
    }
    private static boolean dgnDots(int x, int y, int dx, char ch) {
        boolean result = true;
        int z = y + dots;
        for (; y < z; y++) {
            if (map [x][y] != ch) {
                result = false;
                break;
            }
            x += dx;
        }
        return result;
    }
}