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
}
