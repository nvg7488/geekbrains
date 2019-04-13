package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 *
 * 2*   Реализовать шейкерную сортировку.
 * 3    Реализовать бинарный алгоритм поиска в виде функции, которой передаётся отсортированный массив.
 *  Функция возвращает индекс найденного элемента, или -1 если элемент не найден.
 * 4*   Подсчитать количество операций для каждой из сортировок и сравнить его с асимптотической
 *  сложностьюалгоритма.
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
}