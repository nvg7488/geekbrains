package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.*;
public class HomeWork4 {
    private static int SIZE = 5;
    private static int DOTS = 4;
    private static char map [][] = new char [SIZE][SIZE];
    private static Scanner sc = new Scanner (System.in);
    private static Random rand = new Random ();

    public static void main(String[] args) {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
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
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int x = 0; x < SIZE; x++) {
            System.out.print((x+1) + " ");
            for (int y = 0; y < SIZE; y++) {
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
        boolean bln = true;
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
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
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!XY(x, y));
        map [x][y] = 'O';
        System.out.println("Программа походила: " + (x+1) + "x" + (y+1));
    }
    private static void stepMen() { int x, y;
        do {
            System.out.println("\nХод игрока:");
            System.out.print("\tX: ");
            x = sc.nextInt() - 1;
            System.out.print("\tY: ");
            y = sc.nextInt() - 1;
        } while (!XY(x, y));
        map [x][y] = 'X';
    }
    private static boolean XY(int x, int y) {
        boolean result;
        if (x < 0 || x > SIZE || y < 0 || y > SIZE)	{
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
        int x, y, z = SIZE - DOTS;
        for (x = 0; x < 2; x++) {
            for (y = 0; y < SIZE; y++) {
                if (blnDots(x, y, 1, 0, ch)) {
                    result = true;
                    break;
                }
            }
        }
        for (y = 0; y < 2; y++) {
            for (x = 0; x < SIZE; x++) {
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
        for (x = DOTS - 1; x < SIZE; x++) {
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
        int i, j, X, Y;
        boolean bln = true;
        if (dx == 0) {
            X = x;
        } else {
            X = x + DOTS;
        }
        if (dy == 0) {
            Y = y;
        } else {
            Y = y + DOTS;
        }
        i = x; do {
            j = y; do {
                if (map [x][y] != ch) {
                    bln = false;
                }
                x += dx;
                y += dy;
                j++;
            } while (j < Y);
            i++;
        } while (i < X);
        return bln;
    }
    private static boolean dgnDots(int x, int y, int dx, char ch) {
        boolean result = true;
        int z = y + DOTS;
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
