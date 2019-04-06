package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.Scanner;
public class HomeWork2 {
    /**
     * Задать целочисленный массив, состоящий из 0 и 1.
     * С помощью цикла и операторы условия заменить 0 и 1.
     * @param array
     * @return array
     */
    public int[] task1(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 0) {
                array[index] = 1;
            } else {
                array[index] = 0;
            }
        }
        return array;
    }

    /**
     * Задать пустой массив. С помощью цикла заполнить его значениями {0, 3, 6, 9, 12, 15, 18, 21}.
     * @param max
     * @return array
     */
    public int[] task2(int max) {
        int[] result = new int[max];
        for (int index = 0; index < max; index++) {
            result[index] = index * 3;
        }
        return result;
    }

    /**
     * Задать массив {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}, пройти по нему циклом:
     * и числа, меньшие 6, удвоить.
     * @param array
     * @return array
     */
    public int[] task3(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] < 6) {
                array[index] *= 2;
            }
        }
        return array;
    }

    /**
     * Создать квадратный двухмерный массив (количество строк = кол. столбцов),
     * с помощью цикла (-ов) заполнить его диагональные элементы единицами.
     * @param kol
     * @return array
     */
    public int[][] task4(int kol) {
        int[][] result = new int[kol][kol];
        for (int x = 0; x < kol; x++) {
            for (int y = 0; y < kol; y++) {
                if (x == y) {
                    result[x][y] = 1;
                } else {
                    result[x][y] = 0;
                }
            }
        }
        return result;
    }

    /**
     * Найти в одномерном массиве минимальное и максимальное значения.
     * @param array
     * @return min, max
     */
    public int[] task5(int[] array) {
        int[] result = new int[2];
        result[0] = array[0];   //  min
        result[1] = array[0];   //  max
        for (int index = 0; index < array.length; index++) {
            if (array[index] < result[0]) {
                result[0] = array[index];
            }
            if (array[index] > result[1]) {
                result[1] = array[index];
            }
        }
        return result;
    }
}
