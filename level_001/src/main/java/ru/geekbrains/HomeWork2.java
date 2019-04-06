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
}
