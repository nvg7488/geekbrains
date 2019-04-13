package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class HomeWork3 {
    /**
     * Написать функцию пузырьковой сортировки, которая возвращает количество операций.
     * @param array
     * @return array
     */
    public int[] task1(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * Реализовать шейкерную сортировку.
     * @param array
     * @return array
     */
    public int[] task2(int[] array) {
        int tmp;
        int left = 1;
        int right = array.length - 1;
        while (left <= right) {
            for (int index = right; index >= left; index--) {
                if (array[index - 1] > array[index]) {
                    tmp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = tmp;
                }
            }
            left++;
            for (int index = left; index <= right; index++) {
                if (array[index - 1] > array[index]) {
                    tmp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = tmp;
                }
            }
            right--;
        }
        return array;
    }

    /**
     * Реализовать бинарный алгоритм поиска в виде функции, которой передаётся отсортированный массив.
     * Функция возвращает индекс найденного элемента, или -1 если элемент не найден.
     * @param array
     * @return index
     */
    public int task3(int[] array, int from, int to, int vlm) {
        int result = -1;
        if (to - from == 1) {
            if (array[from] == vlm) {
                result = vlm;
            }
            if (array[to] == vlm) {
                result = vlm;
            }
        } else {
            int middle = (from + to) / 2;
            if (array[middle] == vlm) {
                result = middle;
            }
            if (array[middle] < vlm) {
                result = task3(array, middle, to, vlm);
            }
        }
        return result;
    }
}